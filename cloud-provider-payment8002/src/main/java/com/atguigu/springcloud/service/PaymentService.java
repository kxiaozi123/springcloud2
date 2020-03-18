package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * @auther zzyy
 * @create 2020-02-18 10:40
 */
public interface PaymentService
{
     int create(Payment payment);

     Payment getPaymentById(Long id);
}
