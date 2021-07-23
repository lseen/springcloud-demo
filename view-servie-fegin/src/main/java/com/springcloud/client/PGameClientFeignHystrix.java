package com.springcloud.client;

import com.springcloud.pojo.PGame;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PGameClientFeignHystrix implements PGameFeignClient {

    @Override
    public List<PGame> listPGame() {
        List<PGame> result = new ArrayList<>();
        result.add(new PGame(400,"数据微服务暂时不可用",null,null,null,null,null));
        return result;
    }
}
