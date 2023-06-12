package com.example.demo.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entidade.contato;

public interface RepositorioContato extends JpaRepository <contato, Long> {
    
}
