package source.webcfd.mapstruct ;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import source.webcfd.dto.CategoryDto;
import source.webcfd.entity.Category;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    @Mapping(source = "course.id", target = "courseId")
    CategoryDto categoryToCategoryDto(Category category);

    @Mapping(source = "courseId", target = "course.id")
    Category categoryDtoToCategory(CategoryDto categoryDto);
}
