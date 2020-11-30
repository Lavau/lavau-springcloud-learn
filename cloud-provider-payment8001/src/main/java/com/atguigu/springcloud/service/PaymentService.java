package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entity.Payment;

/**
 * description payment service
 *
 * @author Leet
 * @date 2020-11-27 20:18
 **/
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(long id);
}
