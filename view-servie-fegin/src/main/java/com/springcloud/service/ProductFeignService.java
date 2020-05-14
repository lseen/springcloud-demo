package com.springcloud.service;

import com.springcloud.client.ProductFeignClient;
import com.springcloud.pojo.Product;
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
