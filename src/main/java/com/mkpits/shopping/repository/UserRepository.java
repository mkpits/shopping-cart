package com.mkpits.shopping.repository;

import com.mkpits.shopping.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}
