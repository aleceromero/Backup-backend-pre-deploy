package com.portfolio3.repository;

import com.portfolio3.entity.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPersona extends JpaRepository <Persona,Integer> {
    public List<Persona> findByEmailLoginAndPassword(String emailLogin, String password);
}
