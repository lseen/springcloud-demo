package com.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PGame {
    private Integer gameId;
    private String commodityName;
    private String commodityImg;
    private Double beginSecond;
    private String endSecond;
    private Integer couponId;
    private String createTime;
}