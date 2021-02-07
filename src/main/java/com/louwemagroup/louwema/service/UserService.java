package com.louwemagroup.louwema.service;

import com.louwemagroup.louwema.dao.UserApp;
import com.louwemagroup.louwema.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Transactional
    public Iterable<UserApp> getAllUser(){
       return this.userRepository.findAll();
    }
}
