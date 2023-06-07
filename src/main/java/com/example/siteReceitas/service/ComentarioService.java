package com.example.siteReceitas.service;


import com.example.siteReceitas.models.Comentario;
import com.example.siteReceitas.repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComentarioService {

    @Autowired
    private ComentarioRepository comentarioRepository;

    public List<Comentario> getAllComentarios(){
        return  comentarioRepository.findAll();
    }

    public Optional<Comentario> getComentarioById(Long id){
        return comentarioRepository.findById(id);
    }
}
