package com.example.demo.service;

import com.example.demo.model.Recurso;
import com.example.demo.repository.RecursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecursoService {

    private final RecursoRepository recursoRepository;

    public RecursoService(RecursoRepository recursoRepository) {
        this.recursoRepository = recursoRepository;
    }

    public List<Recurso> findByNome(String nome) {
        return recursoRepository.findByNome(nome);
    }
}
