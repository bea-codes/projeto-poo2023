package com.example.siteReceitas.dto;

import com.example.siteReceitas.models.Comentario;
import com.example.siteReceitas.models.UserAbstract;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReceitaDto {
    private Long id;
    private UserAbstract autor;
    private String titulo;
    private String descricao;
    private String instrucoesPreparoPasso1;
    private String instrucosPreparoPasso2;
    private String tempoDePreparo;
    private String infoAdicional;
    private LocalDateTime dataDePostagem;
    private ArrayList<String> ingredientes = new ArrayList<String>();
    private ArrayList<Comentario> comentarios = new ArrayList<Comentario>();
}