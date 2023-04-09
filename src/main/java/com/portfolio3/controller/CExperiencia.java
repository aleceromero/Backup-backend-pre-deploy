package com.portfolio3.controller;

import com.portfolio3.entity.Experiencia;
import com.portfolio3.service.SExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("experiencia") //localhost:8080/experiencia
@CrossOrigin(origins = "http://localhost:4200")
public class CExperiencia {
    
    @Autowired
    SExperiencia expeServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Experiencia> getExperiencias(){
        return expeServ.getExperiencias();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Experiencia findExperiencia(@PathVariable int id){
        return expeServ.findExperiencia(id);
    }
    
    @PostMapping ("/crear")
    public String saveExperiencia(@RequestBody Experiencia expe){
        expeServ.saveExperiencia(expe);
        return "La experiencia fue creada correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String deleteExperiencia(@PathVariable int id){
        expeServ.deleteExperiencia(id);
        return "La experiencia fue eliminada correctamente";
    }
    
    @PutMapping ("/editar")
    public String editExperiencia(@RequestBody Experiencia expe){
        expeServ.editExperiencia(expe);
        return "La experiencia fue editada correctamente";
    }
    
}
