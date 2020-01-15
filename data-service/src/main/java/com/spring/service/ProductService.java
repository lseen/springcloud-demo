package com.spring.service;

import com.spring.dao.ProductDao;
import com.spring.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Value("${server.port}")
    String port;

    @Autowired
    private ProductDao productDao;

    public List<Product> listProducts() {
        System.out.println("当前端口是" + port);
        return productDao.listProducts();
    }
}
