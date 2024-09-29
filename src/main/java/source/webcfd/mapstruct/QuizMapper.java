package source.webcfd.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import source.webcfd.dto.QuizDto;
import source.webcfd.entity.Question;
import source.webcfd.entity.Quiz;

import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface QuizMapper {

    QuizMapper INSTANCE = Mappers.getMapper(QuizMapper.class);

    @Mapping(source = "lesson.id", target = "lessonId")
    @Mapping(target = "questionIds", expression = "java(mapQuestionIds(quiz.getQuestions()))") // Ánh xạ thủ công
    QuizDto quizToQuizDto(Quiz quiz);

    @Mapping(source = "lessonId", target = "lesson.id")
    @Mapping(target = "questions", ignore = true)  // Ignore ánh xạ ngược danh sách questions
    Quiz quizDtoToQuiz(QuizDto quizDto);

    // Phương thức ánh xạ List<Question> thành List<Long> (ID)
    default List<Long> mapQuestionIds(List<Question> questions) {
        return questions.stream()
                .map(Question::getId)  // Lấy ID của mỗi Question
                .collect(Collectors.toList());
    }
}
