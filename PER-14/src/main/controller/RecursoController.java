package com.example.demo.controller;

import com.example.demo.model.Recurso;
import com.example.demo.service.RecursoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecursoController {

    private final RecursoService recursoService;

    public RecursoController(RecursoService recursoService) {
        this.recursoService = recursoService;
    }

    @GetMapping("/recursos")
    public List<Recurso> findByNome(@RequestParam String nome) {
        return recursoService.findByNome(nome);
    }
}
