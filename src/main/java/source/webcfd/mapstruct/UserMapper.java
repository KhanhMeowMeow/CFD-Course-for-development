package source.webcfd.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import source.webcfd.dto.UserDto;
import source.webcfd.entity.User;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "role.id", target = "roleId")
    UserDto userToUserDto(User user);

    @Mapping(source = "roleId", target = "role.id")
    User userDtoToUser(UserDto userDto);
}
