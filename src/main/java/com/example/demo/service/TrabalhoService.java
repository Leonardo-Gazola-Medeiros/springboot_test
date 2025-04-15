package com.example.demo.service;

import com.example.demo.model.Trabalho;
import java.util.List;

public interface TrabalhoService {
    Trabalho adicionarTrabalho(Trabalho trabalho);
    List<Trabalho> listarTrabalhos();
    List<Trabalho> listarTrabalhosPorTituloNota(String titulo, int notaMinima);
    
}
