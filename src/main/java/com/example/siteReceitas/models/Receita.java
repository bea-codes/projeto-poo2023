package com.example.siteReceitas.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Receita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

//    @ManyToOne
//    @JoinColumn(name = "user")
    private UserPadrao autor;
    private String titulo;
    private String descricao;
    private String instrucoesPreparoPasso1;
    private String instrucosPreparoPasso2;
    private String tempoDePreparo;
    private String infoAdicional;
    private LocalDateTime dataDePostagem;
    private ArrayList<String> ingredientes;

    @OneToMany(mappedBy = "receita", cascade = CascadeType.ALL)
    private ArrayList<Comentario> comentarios;
}
