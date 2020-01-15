package com.spring.service;

import com.spring.client.ProductRibbonClient;
import com.spring.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductRibbonService {
    @Autowired
    ProductRibbonClient ribbonClient;

    public List<Product> listProducts() {
        return ribbonClient.listProducts();
    }
}
