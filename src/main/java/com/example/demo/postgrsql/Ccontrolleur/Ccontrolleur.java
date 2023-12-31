package com.example.demo.postgrsql.Ccontrolleur;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.postgrsql.Cservice.Cservice;
import com.example.demo.postgrsql.Entity.Model;


@RestController
@RequestMapping("/api")
public class Ccontrolleur {
    
    @Autowired
    private Cservice cservice ;

   
    @PostMapping(path = "/dentaire")
    
   public Model postdetailsContact(@RequestBody Model data){
    
    
    return cservice.savedetailsContact(data);
   }
}
