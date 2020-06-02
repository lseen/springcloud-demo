package com.springcloud.controller;

import com.springcloud.pojo.Product;
import com.springcloud.service.ProductFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductFeignController {

    @Autowired
    ProductFeignService productFeignService;

    @RequestMapping(path = "/products")
    public String products(Model m) {
        List<Product> ps = productFeignService.listProducts();
        m.addAttribute("ps", ps);
        return "products";
    }
}
