package com.springcloud.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springcloud.pojo.PGame;

public interface PGameService {
    IPage<PGame> selectPage(Page<?> page, Integer state);
}
