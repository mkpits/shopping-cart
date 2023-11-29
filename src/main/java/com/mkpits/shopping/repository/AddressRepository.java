package com.mkpits.shopping.repository;

import com.mkpits.shopping.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {

}
