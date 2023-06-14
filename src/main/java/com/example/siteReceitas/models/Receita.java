package com.example.siteReceitas.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Receita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "receita_id")
    private UserPadrao autor;
    private String titulo;
    private String descricao;
    private String instrucoesPreparoPasso1;
    private String instrucosPreparoPasso2;
    private String tempoDePreparo;
    private String infoAdicional;
    private Date dataDePostagem;
    private List<String> ingredientes;

    @OneToMany(mappedBy = "receita", cascade = CascadeType.ALL)
    private List<Comentario> comentarios;

}
