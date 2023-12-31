package com.example.demo.postgrsql.Crepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.postgrsql.Entity.Model;

@Repository
public interface Crepository extends JpaRepository<Model, Long>{
    
}
