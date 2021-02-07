package com.louwemagroup.louwema.controller;

import com.louwemagroup.louwema.api.UserApi;
import com.louwemagroup.louwema.converter.UserConverter;
import com.louwemagroup.louwema.dao.UserApp;
import com.louwemagroup.louwema.model.UserDTO;
import com.louwemagroup.louwema.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class UserController  implements UserApi {

    @Autowired
    UserService userService;
    @Autowired
    UserConverter userConverter;

    @Override
    @RequestMapping("/user/getAllUser")
    public ResponseEntity<List<UserDTO>> getAllUser() {
        List<UserDTO> userList =new ArrayList<UserDTO>();
        Iterable<UserApp> listOfUser =  new ArrayList<>();
        listOfUser =   this.userService.getAllUser();
        for (UserApp user:listOfUser){
            userList.add(userConverter.userToUserDTO(user));
        }
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }
}
