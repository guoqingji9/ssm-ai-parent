package org.example.spring.ioc;

import org.example.spring.ioc.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "org.example.spring")
public class Spring01IocApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Spring01IocApplication.class, args);
//        Object ceshi = ioc.getBean("ceshi");
//        System.out.println(ceshi);
//        ioc.getBean(Person.class);
        UserController bean = ioc.getBean(UserController.class);
        System.out.println(bean);
    }
}
