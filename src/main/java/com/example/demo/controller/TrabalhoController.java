package com.example.demo.controller;

import com.example.demo.model.Trabalho;
import com.example.demo.service.TrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;;


@RestController
@RequestMapping("/trabalho")
public class TrabalhoController {
    @Autowired
    private TrabalhoService trabalhoService;

    @PostMapping
    public Trabalho adicionarTrabalho(@RequestBody Trabalho trabalho) {
        return trabalhoService.adicionarTrabalho(trabalho);
    }

    @GetMapping
    public List<Trabalho> listarTrabalhos() {
        return trabalhoService.listarTrabalhos();
    }

    @GetMapping("/filtro")
    public List<Trabalho> listarTrabalhosPorTituloNota(@RequestParam String titulo, @RequestParam int notaMinima) {
        return trabalhoService.listarTrabalhosPorTituloNota(titulo, notaMinima);
    }
    
    
}
