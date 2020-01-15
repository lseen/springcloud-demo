package com.spring.controller;

import com.spring.pojo.Product;
import com.spring.service.ProductRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductRibbonController {

    @Autowired
    ProductRibbonService ribbonService;

    @RequestMapping("/products")
    public Object products(Model m) {
        List<Product> ps = ribbonService.listProducts();
        m.addAttribute("ps", ps);
        return "products";
    }
}
