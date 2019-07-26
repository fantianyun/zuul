package com.fty.zuul;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {
    public static void main(String[] args) {
//       new SpringApplicationBuilder(ZuulApplication.class).web(WebApplicationType.NONE).run(args);
        new SpringApplicationBuilder(ZuulApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
