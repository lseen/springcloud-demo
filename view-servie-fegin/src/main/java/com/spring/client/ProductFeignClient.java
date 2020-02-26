package com.spring.client;

import com.spring.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "DATA-SERVICE", fallback = ProductClientFeignHystrix.class)
public interface ProductFeignClient {

    @GetMapping("/products")
    List<Product> listProducts();
}
