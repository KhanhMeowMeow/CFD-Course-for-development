package source.webcfd.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import source.webcfd.dto.QuestionDto;
import source.webcfd.entity.Option;
import source.webcfd.entity.Question;

import java.util.List;
import java.util.stream.Collectors;


public interface QuestionMapper {
    QuestionMapper INSTANCE = Mappers.getMapper(QuestionMapper.class);

    @Mapping(source = "quiz.id", target = "quizId")
    @Mapping(source = "questionType.id", target = "questionTypeId")
    @Mapping(target = "optionIds", expression = "java(mapOptionIds(question.getOptions()))")
    QuestionDto questionToQuestionDto(Question question);

    @Mapping(source = "quizId", target = "quiz.id")
    @Mapping(source = "questionTypeId", target = "questionType.id")
    @Mapping(target = "options", ignore = true) // Ignore ánh xạ ngược options
    Question questionDtoToQuestion(QuestionDto questionDto);

    // Phương thức ánh xạ List<Option> thành List<Long> (ID)
    default List<Long> mapOptionIds(List<Option> options) {
        return options.stream()
                .map(Option::getId)  // Lấy ID của mỗi Option
                .collect(Collectors.toList());
    }
}
