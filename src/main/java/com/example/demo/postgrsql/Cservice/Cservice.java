package com.example.demo.postgrsql.Cservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.postgrsql.Crepository.Crepository;
import com.example.demo.postgrsql.Entity.Model;

@Service
public class Cservice {
    @Autowired
    private Crepository crepository;

    
    
    public Model savedetailsContact(Model data) {
        System.out.println("hi");
       
        System.out.println("Attempting to save contact: " + data.toString());
        Model savedData = crepository.save(data);
        
        
        return savedData;
       

       }
}
