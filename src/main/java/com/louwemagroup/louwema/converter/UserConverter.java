package com.louwemagroup.louwema.converter;

import com.louwemagroup.louwema.dao.UserApp;
import com.louwemagroup.louwema.model.UserDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserConverter {
    UserDTO userToUserDTO(UserApp user);
}
