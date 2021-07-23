package com.springcloud.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springcloud.pojo.PGame;
import com.springcloud.service.impl.PGameServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PGameController {

    @Autowired
    PGameServiceImpl pGameService;

    //查询
    @GetMapping("/gameList")
    public Object products() {
        //总页数+总记录数
        Page<PGame> page = new Page<>(1, 5);
        //调用自定义sql
        IPage<PGame> iPage = pGameService.selectPage(page, 5);
        System.out.println("总页数:" + iPage.getPages());
        System.out.println("总记录数:" + iPage.getTotal());
        List<PGame> list = iPage.getRecords();
        list.forEach(System.out::println);
        return list;
    }

}
