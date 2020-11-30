package com.atguigu.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * description 支付实体类
 *
 * @author Leet
 * @date 2020-11-27 17:09
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    // 因为 payment 表中的 id 类型为 bigint(20)
    private Long id;
    private String serial;
}
