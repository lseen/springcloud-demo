package com.springcloud.service;

import com.springcloud.client.ProductRibbonClient;
import com.springcloud.pojo.Product;
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
