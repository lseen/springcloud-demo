package com.springcloud.controller;

import com.springcloud.pojo.PGame;
import com.springcloud.service.PGameFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PGameFeignController {

    @Autowired
    PGameFeignService productFeignService;

    @RequestMapping(path = "/gameList")
    public String products(Model m) {
        List<PGame> ps = productFeignService.listProducts();
        m.addAttribute("ps", ps);
        return "pGameList";
    }
}
