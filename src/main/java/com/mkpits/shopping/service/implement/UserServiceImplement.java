package com.mkpits.shopping.service.implement;

import com.mkpits.shopping.model.UserEntity;
import com.mkpits.shopping.repository.UserRepository;
import com.mkpits.shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplement implements UserService {
    @Autowired
    public UserRepository userRepository;
    @Override
    public UserEntity createUser(UserEntity userEntity) {

        return userRepository.save(userEntity);
    }
}
