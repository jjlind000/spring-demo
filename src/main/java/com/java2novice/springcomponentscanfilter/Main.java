package com.java2novice.springcomponentscanfilter;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.service.J2nInventoryService;

//http://www.java2novice.com/spring/filter-auto-scan-components/
public class Main {

    public static void main(String a[]){
        String confFile = "component-scan-with-filter.xml";
        ConfigurableApplicationContext context
                = new ClassPathXmlApplicationContext(confFile);
        J2nInventoryService inventoryService
                = (J2nInventoryService) context.getBean("j2nInventoryService");
        inventoryService.testInventoryServce();
    }
}