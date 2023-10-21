package com.mkpits.shopping.repository;

import com.mkpits.shopping.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
}
