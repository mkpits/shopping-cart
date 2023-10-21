package com.mkpits.shopping.repository;

import com.mkpits.shopping.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo  extends JpaRepository <User, Long>{


}
