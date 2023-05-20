package com.example.siteReceitas.dto;

import com.example.siteReceitas.models.Receita;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAbstractDtio {
    private Long id;
    private String nome;
    private String email;
    private Date dataNascimento;
    private ArrayList<Receita> receitasFavoritas = new ArrayList<Receita>();
}
