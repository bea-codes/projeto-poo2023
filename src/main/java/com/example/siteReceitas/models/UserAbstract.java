package com.example.siteReceitas.models;




import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.ArrayList;

@Data
public abstract class UserAbstract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private Date dataNascimento;

    @OneToMany(mappedBy = "usuario")
    private ArrayList<Receita> receitasFavoritas = new ArrayList<Receita>();

//    public abstract void enviarPostagem();
//    public abstract void excluirPostagem();
//    public abstract void enviarComentario();
//    public abstract void excluirComentario();
}
