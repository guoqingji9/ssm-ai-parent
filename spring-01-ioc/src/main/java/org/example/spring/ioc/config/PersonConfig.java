package org.example.spring.ioc.config;

import org.example.spring.ioc.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gqj
 * @create 2024-12-04 16:31
 */
@Configuration
public class PersonConfig {
    @Bean
    public Person ceshi(){
        Person person = new Person();
        person.setName("111");
        person.setAge(20);
        person.setGender("男");
        return person;
    }
}
