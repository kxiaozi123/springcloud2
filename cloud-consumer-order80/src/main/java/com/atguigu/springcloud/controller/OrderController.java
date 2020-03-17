package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @auther zzyy
 * @create 2020-02-18 17:23
 */
@RestController
@Slf4j
public class OrderController
{
    public static final String PAYMENT_URL = "http://localhost:8001";

    //public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/consumer/payment/create")
    public CommonResult create(Payment payment)
    {
        return restTemplate.postForObject(PAYMENT_URL +"/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }


}
