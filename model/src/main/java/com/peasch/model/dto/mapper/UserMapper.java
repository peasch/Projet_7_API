package com.peasch.model.dto.mapper;

import com.peasch.model.entities.User;
import com.peasch.model.dto.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User fromDtoToUser(UserDto userDto);
    UserDto fromUserToDto (User user);
}
