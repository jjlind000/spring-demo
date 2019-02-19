package com.java2novice_2.service;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.java2novice_2.dao.InventoryDao;
 
@Service("j2nInventoryService")
public class J2nInventoryService {

    J2nInventoryService(){
        System.out.println("J2nInventoryService const");
    }

    @Autowired
    private InventoryDao inventoryDao;
     
    public void testInventoryServce(){
        System.out.println("Inside service class, testInventoryServce()");
        inventoryDao.printInventoryDaoStatus();
    }
}