package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
//@EnableZuulServer // 开启 Zuul 注解
@EnableZuulProxy
public class ZuulServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(ZuulServerApplication.class,args);
  }

}
