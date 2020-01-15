package com.spring.client;

import com.spring.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class ProductRibbonClient {
    /**
     * 客户端负均衡，默认轮询
     */
    @Autowired
    RestTemplate restTemplate;

    public List<Product> listProducts() {
        return restTemplate.getForObject("http://DATA-SERVICE/products", List.class);
    }
}
