package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.database.RepositorioContato;
import com.example.demo.entidade.contato;

@RestController
@RequestMapping("/contato")
public class contatoRest {
    
    @Autowired
    private RepositorioContato repositorio;

    @GetMapping
    public List<contato>listar(){
        return repositorio.findAll();
    }
    @PostMapping
    public void salvar(@RequestBody contato Contato){
        repositorio.save(Contato);
    }
    @PutMapping
    public void alterar(@RequestBody contato Contato){
        if(Contato.getId()> 0)
        repositorio.save(Contato);
    }
    @DeleteMapping
    public void excluir(@RequestBody contato Contato){
        repositorio.delete(Contato);
    }

}
