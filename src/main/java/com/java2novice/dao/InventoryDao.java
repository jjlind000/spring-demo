package com.java2novice.dao;
 
import org.springframework.stereotype.Component;
 
@Component
public class InventoryDao {
     
    public void printInventoryDaoStatus(){
        System.out.println("Inside InventoryDao & status method");
    }
}