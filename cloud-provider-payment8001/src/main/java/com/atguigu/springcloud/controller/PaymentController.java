package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entity.CommonResult;
import com.atguigu.springcloud.entity.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * description payment controller
 *
 * @author Leet
 * @date 2020-11-27 20:22
 **/
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {
        log.info(payment.toString());
        int result = paymentService.create(payment);
        log.info("*****插入结果： " + result);

        if (result > 0) {
            return new CommonResult(200, "插入数据库成功", result);
        } else {
            return new CommonResult(444, "插入数据库失败", result);
        }
    }

    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果结果： " + payment);

        if (payment == null) {
            return new CommonResult(444, "没有对应记录，ID:" + id, null);

        } else {
            return new CommonResult(200, "查询成功", payment);

        }
    }
}
