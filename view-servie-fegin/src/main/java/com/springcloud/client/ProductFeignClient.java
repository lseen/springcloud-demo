package com.springcloud.client;

import com.springcloud.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//服务熔断
@FeignClient(name = "DATA-SERVICE", fallback = ProductClientFeignHystrix.class)
public interface ProductFeignClient {

    @GetMapping("/products")
    List<Product> listProducts();
}
