package com.example.siteReceitas.controller;

import java.util.stream.Collectors;

import com.example.siteReceitas.dto.ComentarioDto;
import com.example.siteReceitas.models.Comentario;
import com.example.siteReceitas.repository.ComentarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comentario")
public class ComentarioController {

    @Autowired
    private ComentarioRepository comentarioRepository;

        private ComentarioDto toDTO (Comentario comentario){

            return  new ComentarioDto(comentario.getId(),
                    comentario.getAutor(),
                    comentario.getConteudo());
        }

        private Comentario toModel(ComentarioDto comentarioDto){
            Comentario comentario = new Comentario();
            comentario.setId(comentarioDto.getId());
            comentario.setAutor(comentarioDto.getAutor());
            comentario.setConteudo(comentarioDto.getConteudo());

            return comentario;

        }

}
