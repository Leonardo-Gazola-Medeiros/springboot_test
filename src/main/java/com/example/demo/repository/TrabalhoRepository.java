package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Trabalho;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //Tem que lembrar de colocar esse repository aqui
public interface TrabalhoRepository extends JpaRepository<Trabalho, Long> {
    
    List<Trabalho> findByTituloContainingAndNotaGreaterThan(String titulo, int notaMinima);

}
