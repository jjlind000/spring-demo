package com.java2novice_2.springdemo;

import com.java2novice_2.service.J2nInventoryService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String...args){
        System.out.println("before context created");
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("component-scan-context.xml");
        System.out.println("after context created");
        J2nInventoryService inventoryService = (J2nInventoryService) context.getBean("j2nInventoryService");
        System.out.println("after j2n bean retrieved from context");
        inventoryService.testInventoryServce();
    }
}
