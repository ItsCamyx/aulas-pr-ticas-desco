package com.example.demo.controller;

import com.example.demo.model.Projeto;
import com.example.demo.service.ProjetoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjetoController {

    private final ProjetoService projetoService;

    public ProjetoController(ProjetoService projetoService) {
        this.projetoService = projetoService;
    }

    @GetMapping("/projetos")
    public List<Projeto> findByDescricao(@RequestParam String descricao) {
        return projetoService.findByDescricao(descricao);
    }
}
