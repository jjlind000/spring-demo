package com.java2novice_2.dao;

import org.springframework.stereotype.Component;

@Component
public class InventoryDao {

    InventoryDao(){
        System.out.println("InventoryDao const");
    }

    public void printInventoryDaoStatus() {
        System.out.println("Inside InventoryDao & status method");
    }
}