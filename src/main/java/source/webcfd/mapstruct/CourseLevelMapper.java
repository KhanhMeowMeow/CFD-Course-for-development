package source.webcfd.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import source.webcfd.dto.CourseLevelDto;
import source.webcfd.entity.CourseLevel;

@Mapper
public interface CourseLevelMapper {

    CourseLevelMapper INSTANCE = Mappers.getMapper(CourseLevelMapper.class);

    CourseLevelDto courseLevelToCourseLevelDto(CourseLevel courseLevel);

    CourseLevel courseLevelDtoToCourseLevel(CourseLevelDto courseLevelDto);
}
