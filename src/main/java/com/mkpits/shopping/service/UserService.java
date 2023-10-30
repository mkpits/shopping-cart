package com.mkpits.shopping.service;

import com.mkpits.shopping.model.UserEntity;
import org.springframework.stereotype.Repository;


public interface UserService {

    public UserEntity createUser(UserEntity userEntity);
}
