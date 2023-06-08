package com.example.siteReceitas.service;


import com.example.siteReceitas.models.Comentario;
import com.example.siteReceitas.repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComentarioService {

    @Autowired
    private ComentarioRepository comentarioRepository;

    public List<Comentario> getAllComentarios(){
        return comentarioRepository.findAll();
    }

    public Optional<Comentario> getComentarioById(Long id){
        return comentarioRepository.findById(id);
    }

    public Comentario createComentario(Comentario comentario){
        return comentarioRepository.save(comentario);
    }

    public void deleteComentario(Long id){
        comentarioRepository.deleteById(id);
    }

    public Comentario updateComentario(Long id, Comentario comentario) throws ChangeSetPersister.NotFoundException {
        Comentario comentarioExistente = comentarioRepository.findById(id).orElseThrow(() -> new ChangeSetPersister.NotFoundException());
        comentarioExistente.setConteudo(comentario.getConteudo());
        return comentarioRepository.save(comentarioExistente);
    }
}
