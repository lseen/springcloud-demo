package com.springcloud.client;

import com.springcloud.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class ProductRibbonClient {

    @Autowired
    RestTemplate restTemplate;

    public List<Product> listProducts() {
        return restTemplate.getForObject("http://DATA-SERVICE/products", List.class);
    }
}
