package com.springcloud.client;

import com.springcloud.pojo.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductClientFeignHystrix implements ProductFeignClient {

    @Override
    public List<Product> listProducts() {
        List<Product> result = new ArrayList<>();
        result.add(new Product(0, "数据微服务不可用", 0));
        return result;
    }
}
