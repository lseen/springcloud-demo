package com.springcloud.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springcloud.dao.PGameDAO;
import com.springcloud.pojo.PGame;
import com.springcloud.service.PGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PGameServiceImpl implements PGameService {

    @Value("${server.port}")
    String port;

    @Autowired
    private PGameDAO pGameDAO;

    @Override
    public IPage<PGame> selectPage(Page<?> page, Integer state) {
        // 不进行 count sql 优化，解决 MP 无法自动优化 SQL 问题，这时候你需要自己查询 count 部分
        //page.setOptimizeCountSql(false);
        // 当 total 为小于 0 或者设置 setSearchCount(false) 分页插件不会进行 count 查询
        // 要点!! 分页返回的对象与传入的对象是同一个
        return pGameDAO.selectPage(page, state);
    }
}
