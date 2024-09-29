package source.webcfd.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import source.webcfd.dto.QuestionTypeDto;
import source.webcfd.entity.QuestionType;

@Mapper
public interface QuestionTypeMapper {
    QuestionTypeMapper INSTANCE = Mappers.getMapper(QuestionTypeMapper.class);

    QuestionTypeDto questionTypeToQuestionTypeDto(QuestionType questionType);

    QuestionType questionTypeDtoToQuestionType(QuestionTypeDto questionTypeDto);
}
