package com.mkpits.shopping.repository;

import com.mkpits.shopping.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findUserEntityByEmail(String email);

    @Query("select u from UserEntity u where u.email = :email")
    UserEntity findUserByUserName(@Param("email") String email);
}
