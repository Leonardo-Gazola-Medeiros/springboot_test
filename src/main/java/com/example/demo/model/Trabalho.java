package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.*;

@Entity
@Table(name = "tra_trabalho")
@Data // OS IMPORTS ABAIXO SÃO DO LOMBOK PARA NÃO PRECISAR FAZER GETTERS E SETTERS
@NoArgsConstructor 
@AllArgsConstructor
@Builder
public class Trabalho {
    @Id //Lembrar desse ID aqui
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Lembrar do valor generativo pra cada coisa, tem q especificar
    @Column(name = "tra_id") //O resto é só assim mesmo
    private Long id;

    @Column(name = "tra_titulo", nullable = false, unique = true)
    private String titulo;

    @Column(name = "tra_data_hora_entrega", nullable = false)
    private LocalDateTime dataHoraEntrega;

    @Column(name = "tra_descricao")
    private String descricao;

    @Column(name = "tra_grupo", nullable = false)
    private String grupo;

    @Column(name = "tra_nota")
    private Integer nota;

    @Column(name = "tra_justificativa")
    private String justificativa;

}



