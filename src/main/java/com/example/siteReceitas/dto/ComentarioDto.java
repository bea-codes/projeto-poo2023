package com.example.siteReceitas.dto;


import com.example.siteReceitas.models.UserAbstract;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComentarioDto {
    private Long id;
    private UserAbstract autor;
    private String conteudo

}
