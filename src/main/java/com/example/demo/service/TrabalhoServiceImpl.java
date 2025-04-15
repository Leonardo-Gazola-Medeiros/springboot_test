package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.model.Trabalho;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.TrabalhoRepository;

import java.util.List;

@Service
public class TrabalhoServiceImpl implements TrabalhoService {
    
    @Autowired
    private TrabalhoRepository trabalhoRepository;

    @Override
    public Trabalho adicionarTrabalho(Trabalho trabalho) {
        return trabalhoRepository.save(trabalho);
    }

    @Override
    public List<Trabalho> listarTrabalhos() {
        return trabalhoRepository.findAll();
    }

    @Override
    public List<Trabalho> listarTrabalhosPorTituloNota(String titulo, int notaMinima) {
        return trabalhoRepository.findByTituloContainingAndNotaGreaterThan(titulo, notaMinima);
    }

}
