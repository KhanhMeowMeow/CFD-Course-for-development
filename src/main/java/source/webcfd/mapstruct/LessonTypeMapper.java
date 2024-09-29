package source.webcfd.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import source.webcfd.dto.LessonTypeDto;
import source.webcfd.entity.LessonType;

@Mapper
public interface LessonTypeMapper {

    LessonTypeMapper INSTANCE = Mappers.getMapper(LessonTypeMapper.class);

    LessonTypeDto lessonTypeToLessonTypeDto(LessonType lessonType);

    LessonType lessonTypeDtoToLessonType(LessonTypeDto lessonTypeDto);
}
