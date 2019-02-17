package com.java2novice.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {
 
    private int empId;
    private String name;
    private String role;
     
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public void afterPropertiesSet() {
        System.out.println("Inside init() method...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside destroy() method...");
    }
}