package com.java2novice.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee2 {
 
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

    @PostConstruct
    public void postConst() {
        System.out.println("Inside E2 init() method...");
    }

    @PreDestroy
    public void preDest() throws Exception {
        System.out.println("Inside E2 destroy() method...");
    }



}