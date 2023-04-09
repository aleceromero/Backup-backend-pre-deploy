package com.portfolio3.service;

import com.portfolio3.entity.Experiencia;
import com.portfolio3.repository.RExperiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
    
    @Autowired
    public RExperiencia expeRep;
    
    public List<Experiencia> getExperiencias() {
        List<Experiencia> listaExperiencias = expeRep.findAll();
        return listaExperiencias;
    }
    
    public Experiencia findExperiencia(int id){
        Experiencia expe = expeRep.findById(id).orElse(null);
        return expe;
    }
    
    public void saveExperiencia(Experiencia expe){
        expeRep.save(expe);
    }
    
    public void deleteExperiencia(int id){
        expeRep.deleteById(id);
    }
    
    public void editExperiencia(Experiencia expe){
        expeRep.save(expe);
    }
    
}
