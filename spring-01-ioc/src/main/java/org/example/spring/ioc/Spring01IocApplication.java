package org.example.spring.ioc;

import org.example.spring.ioc.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Spring01IocApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Spring01IocApplication.class, args);
        Object ceshi = ioc.getBean("ceshi");
        System.out.println(ceshi);
        ioc.getBean(Person.class);
    }

    @Bean
    public Person ceshi(){
        Person person = new Person();
        person.setName("111");
        person.setAge(20);
        person.setGender("男");
        return person;
    }

}
