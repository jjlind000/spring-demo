package com.java2novice.springdemo;

import com.java2novice.bean.Employee;
import com.java2novice.bean.Employee2;
import com.java2novice.bean.MyBeanInitProcessor;
import com.java2novice.bean.MyDbConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@Lazy
@PropertySource(value = { "classpath:db.properties", "app.properties" })
public class Config {

    // a beans default scope is "Singleton" and uses the ID / name of the bean to
    // identify the single instance in the context. There can still be multiple
    // beans of the same interface defined, but as they have different IDs they are
    // still referred to being Singletons

    // @Bean marks the method below to create a bean with the name "myBean" (the name is
    // taken from the method name) and returns an instance of the "MyBeanImpl" class.
    // The method definition marks the return type as "MyBean" but "MyBeanImpl" could also be used.
    @Bean("emp")
    //@Lazy
    public Employee getEmployee() {
        System.out.println("Config.getEmployee");
        return new Employee();
    }

    @Bean("emp2")
    public Employee2 getEmployee2() {
        System.out.println("Config.getEmployee2");
        Employee2 e = new Employee2();
        e.setName("foobar");
        return e;
    }

    @Bean
    public MyBeanInitProcessor myBeanPostProcessor() {
        return new MyBeanInitProcessor();
    }

    @Bean("dbConfig")
    public MyDbConfig getDbConfig(){
        return new MyDbConfig();
    }

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}