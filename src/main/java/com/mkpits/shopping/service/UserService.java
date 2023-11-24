package com.mkpits.shopping.service;

import com.mkpits.shopping.model.UserEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
public interface UserService {

    UserEntity createUser(UserEntity userEntity);

    boolean findUserByUsername(String email);
}
