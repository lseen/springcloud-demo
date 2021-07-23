package com.springcloud.service;

import com.springcloud.client.PGameFeignClient;
import com.springcloud.pojo.PGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PGameFeignService {

    @Autowired
    PGameFeignClient pGameFeignClient;

    public List<PGame> listProducts() {
        return pGameFeignClient.listPGame();
    }
}
