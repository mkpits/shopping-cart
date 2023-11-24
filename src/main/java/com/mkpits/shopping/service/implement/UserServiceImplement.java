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

    @Override
    public boolean findUserByUsername(String email) {

        System.out.println(email + "1");

        UserEntity userEntity = userRepository.findUserEntityByEmail(email);
        System.out.println(userEntity);
        if ((email.equals(userEntity.getEmail()))) {
            return true;
        }
        return false;
    }

}
