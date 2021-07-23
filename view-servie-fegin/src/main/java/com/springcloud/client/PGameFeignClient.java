package com.springcloud.client;

import com.springcloud.pojo.PGame;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//远程调用+服务熔断
@FeignClient(name = "DATA-SERVICE", fallback = PGameClientFeignHystrix.class)
public interface PGameFeignClient {

    @GetMapping("/gameList")
    List<PGame> listPGame();
}
