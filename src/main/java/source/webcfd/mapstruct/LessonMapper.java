package source.webcfd.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import source.webcfd.dto.LessonDto;
import source.webcfd.entity.Lesson;
import source.webcfd.entity.Quiz;

import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface LessonMapper {

    LessonMapper INSTANCE = Mappers.getMapper(LessonMapper.class);

    @Mapping(source = "lessonType.id", target = "lessonTypeId")
    @Mapping(target = "quizIds", expression = "java(mapQuizIds(lesson.getQuizzes()))") // Mapping thủ công
    @Mapping(source = "session.id", target = "sessionId")
    LessonDto lessonToLessonDto(Lesson lesson);

    @Mapping(source = "lessonTypeId", target = "lessonType.id")
    @Mapping(target = "quizzes", ignore = true)  // Ignore để tự xử lý ở service
    @Mapping(source = "sessionId", target = "session.id")
    Lesson lessonDtoToLesson(LessonDto lessonDto);

    // Phương thức chuyển List<Quiz> thành List<Long> (ID)
    default List<Long> mapQuizIds(List<Quiz> quizzes) {
        return quizzes.stream()
                .map(Quiz::getId)  // Lấy ID của mỗi Quiz
                .collect(Collectors.toList());
    }
}
