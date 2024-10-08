package source.webcfd.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import source.webcfd.dto.OptionDto;
import source.webcfd.entity.Option;


public interface OptionMapper {
    OptionMapper INSTANCE = Mappers.getMapper(OptionMapper.class);

    @Mapping(source = "question.id", target = "questionId")
    OptionDto optionToOptionDto(Option option);

    @Mapping(source = "questionId", target = "question.id")
    Option optionDtoToOption(OptionDto optionDto);
}
