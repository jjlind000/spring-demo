package com.java2novice.springdemo;

import com.java2novice.bean.ColorManager;
import com.java2novice.bean.Employee;
import com.java2novice.bean.Employee2;
import com.java2novice.bean.MyDbConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//http://www.java2novice.com/spring/
//context:.. https://howtodoinjava.com/spring-mvc/spring-mvc-difference-between-contextannotation-config-vs-contextcomponent-scan/
//also for properties: http://websystique.com/spring/spring-propertysource-value-annotations-example/
//postprocessing: https://grokonez.com/spring-framework/spring-bean-post-processors
public class Main {

    public static void main(String... args) {
        //doXml();
        doAnnotation();
    }


    public static void doAnnotation(){
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        Employee e = (Employee)context.getBean("emp"); //bean producer method is annotated with @Bean("emp")
//        System.out.println(e.getName());
        Employee2 e2 = (Employee2)context.getBean("emp2"); //bean producer method is annotated with @Bean("emp2")
        System.out.println(e2.getName());
        MyDbConfig dbConfig = (MyDbConfig) context.getBean("dbConfig");
        System.out.println(dbConfig.toString());
        context.registerShutdownHook();
        //or:
        //context.close();

    }
    public static void doXml(){

        System.out.println("before context created");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("after context created");
        System.out.println("before getBean(colormanager)");
        ColorManager clrManager = (ColorManager)context.getBean("colorManager");
        System.out.println("after getBean(colormanager)");
        clrManager.printColor();

        Employee employee = (Employee)context.getBean("employeeBean");
        System.out.println(employee.getName());

    }
}
