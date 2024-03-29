package com.example;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.context.annotation.Bean;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@EnableHystrix
@EnableHystrixDashboard
@EnableZuulProxy
@SpringBootApplication
public class ZuulServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(ZuulServerApplication.class, args);
  }

}
