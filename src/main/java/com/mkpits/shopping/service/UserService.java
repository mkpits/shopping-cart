package com.mkpits.shopping.service;
import com.mkpits.shopping.model.UserEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
public interface UserService {

    public UserEntity createUser(UserEntity userEntity);
}
