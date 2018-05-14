package com.spring.cloud.study.uc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by 37300 on 2018/5/1.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class UCBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(UCBootstrap.class,args);
    }
}
