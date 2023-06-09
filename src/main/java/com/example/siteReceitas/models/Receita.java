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
@Table(name = "receita")
public class Receita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "autor", referencedColumnName = "id")
    private UserAbstract autor;
    private String titulo;
    private String descricao;
    private String instrucoesPreparoPasso1;
    private String instrucosPreparoPasso2;
    private String tempoDePreparo;
    private String infoAdicional;
    private LocalDateTime dataDePostagem;
    private ArrayList<String> ingredientes = new ArrayList<String>();

    @OneToMany(mappedBy = "receita", cascade = CascadeType.ALL)
    private ArrayList<Comentario> comentarios = new ArrayList<Comentario>();
}
