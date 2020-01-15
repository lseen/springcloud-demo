package com.spring.service;

import com.spring.client.ProductFeignClient;
import com.spring.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductFeignService {
    @Autowired
    ProductFeignClient productFeignClient;

    public List<Product> listProducts() {
        return productFeignClient.listProducts();
    }
}
