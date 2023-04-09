package com.portfolio3.repository;

import com.portfolio3.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPersona extends JpaRepository <Persona,Integer> {
    
}
