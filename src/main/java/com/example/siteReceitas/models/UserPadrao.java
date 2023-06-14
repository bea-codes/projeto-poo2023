package com.example.siteReceitas.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class UserPadrao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private Date dataNascimento;


    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
    private List<Receita> receitas;

    @OneToMany(mappedBy = "autor",cascade = CascadeType.ALL)
    private List<Comentario> comentarios;

}
