package com.mkpits.shopping.service.implement;

import com.mkpits.shopping.model.Address;
import com.mkpits.shopping.repository.AddressRepository;
import com.mkpits.shopping.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddServiceImplement implements AddressService {
    @Autowired
    private AddressRepository addressRepository;
    @Override
    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }
}
