package com.example.siteReceitas.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;

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


//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "autor")
//    private ArrayList<Receita> receitas;

}
