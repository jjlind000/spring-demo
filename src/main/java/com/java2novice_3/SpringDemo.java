package com.java2novice_3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.java2novice_3.bean.PaymentGateway;
//autowiring by name demo
//http://www.java2novice.com/spring/auto-wiring-byname/
public class SpringDemo {
 
    public static void main(String a[]){
        //String confFile = "context-autowire-by-name.xml";
        String confFile = "context-autowire-by-name_2.xml";
        System.out.println("b4 context");
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(confFile);
        System.out.println("after context");
        PaymentGateway paymentGateway = (PaymentGateway) context.getBean("paymentGateway");
        System.out.println("after getbean");
        System.out.println(paymentGateway.toString());
    }
}