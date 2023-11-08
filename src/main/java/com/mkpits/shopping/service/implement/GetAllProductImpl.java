package com.mkpits.shopping.service.implement;

import com.mkpits.shopping.model.Product;
import com.mkpits.shopping.repository.GetUserProductRepo;
import com.mkpits.shopping.service.GetUserProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllProductImpl implements GetUserProductService {

    @Autowired
    GetUserProductRepo getUserProductRepo;

    @Override
    public List<Product> getAllProduct() {
       return getUserProductRepo.findAll();
    }
}
