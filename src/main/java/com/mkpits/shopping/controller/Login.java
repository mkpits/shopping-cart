package com.mkpits.shopping.controller;

import com.mkpits.shopping.model.UserEntity;
import com.mkpits.shopping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class Login {
    private UserRepository userRepository;

    @GetMapping("/login")
    public String login() {

        return "login";
    }

    @PostMapping("/checklogin")
    public String userLogin(@RequestParam("email") String email, @RequestParam("password") String password) {
        List<UserEntity> userEntityList = userRepository.findByEmail(email);
        if (userEntityList.size() == 1) {
            UserEntity userEntity = userEntityList.get(0);
            if ((email.equals(userEntity.getEmail())) && (password.equals(userEntity.getPassword()))) {
                return "dashboard.html";
            } else {
                return "redirect:/login";
            }
        } else {
            return "redirect:/login";
        }

    }

//    class LocalSessionFactoryBean {
//        @Bean(name = "entityManagerFactory")
//        public LocalSessionFactoryBean sessionFactory() {
//            LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//
//            return sessionFactory;
//        }
//    }
}

