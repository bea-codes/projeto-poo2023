package com.example.siteReceitas.service;

import com.example.siteReceitas.dto.ComentarioDto;
import com.example.siteReceitas.models.Comentario;
import com.example.siteReceitas.repository.ComentarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComentarioService {

    private final ComentarioRepository comentarioRepository;

    @Autowired
    public ComentarioService(ComentarioRepository comentarioRepository) {
        this.comentarioRepository = comentarioRepository;
    }

    public ComentarioDto criarComentario(ComentarioDto comentarioDto) {
        Comentario comentario = toModel(comentarioDto);
        Comentario comentarioSalvo = comentarioRepository.save(comentario);
        return toDTO(comentarioSalvo);
    }

    private ComentarioDto toDTO(Comentario comentario) {
        return new ComentarioDto(
                comentario.getId(),
                comentario.getAutor(),
                comentario.getConteudo()
        );
    }

    private Comentario toModel(ComentarioDto comentarioDto) {
        Comentario comentario = new Comentario();
        comentario.setId(comentarioDto.getId());
        comentario.setAutor(comentarioDto.getAutor());
        comentario.setConteudo(comentarioDto.getConteudo());
        return comentario;
    }
}
