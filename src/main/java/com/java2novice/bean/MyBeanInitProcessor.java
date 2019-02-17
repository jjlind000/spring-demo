package com.java2novice.bean;
 
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanInitProcessor implements BeanPostProcessor{
 
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        System.out.println("AFTER initialization: "+beanName);
        return bean;
    }
 
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        System.out.println("BEFORE initialization: "+beanName);
        return bean;
    }
}