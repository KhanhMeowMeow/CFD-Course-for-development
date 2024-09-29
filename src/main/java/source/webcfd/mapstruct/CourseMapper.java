package source.webcfd.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import source.webcfd.dto.CourseDto;
import source.webcfd.entity.Course;

@Mapper
public interface CourseMapper {
    CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);

    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "courseLevel.id", target = "courseLevelId")
    CourseDto courseToCourseDto(Course course);

    @Mapping(source = "userId", target = "user.id")
    @Mapping(source = "courseLevelId", target = "courseLevel.id")
    Course courseDtoToCourse(CourseDto courseDto);
}
