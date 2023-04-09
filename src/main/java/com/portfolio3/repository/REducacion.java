package com.portfolio3.repository;

import com.portfolio3.entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository <Educacion,Integer> {
    
}
