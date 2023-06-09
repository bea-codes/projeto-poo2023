package com.example.siteReceitas.controller;

import com.example.siteReceitas.models.Comentario;
import com.example.siteReceitas.models.Receita;
import com.example.siteReceitas.models.UserPadrao;
import com.example.siteReceitas.repository.ComentarioRepository;
import com.example.siteReceitas.repository.ReceitaRepository;
import com.example.siteReceitas.repository.UserPadraoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/usuario", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserPadraoController {
    @Autowired
    public UserPadraoRepository userPadraoRepository;

    @Autowired
    public ReceitaRepository receitaRepository;

    @Autowired
    public ComentarioRepository comentarioRepository;

    @GetMapping()
    public List<UserPadrao> pegarUsuarios(){
        return userPadraoRepository.findAll();
    }
    @GetMapping("/{user_id}")
    public Optional<UserPadrao> pegarUsuarioPorId(@PathVariable long user_id) {
        return userPadraoRepository.findById(user_id);
    }

    @PostMapping
    public UserPadrao criarUsuario(@RequestBody UserPadrao userPadrao) {
        return userPadraoRepository.save(userPadrao);
    }

    @PostMapping("/receita")
    public Receita criarReceita(@RequestBody Receita receita) {
        return receitaRepository.save(receita);
    }

    @PostMapping("/comentario")
    public Comentario criarComentario(@RequestBody Comentario comentario) {
        return comentarioRepository.save(comentario);
    }

    @DeleteMapping("/comentario/{comentario_id}")
    public void deletarComentario(@PathVariable long comentario_id) {
        comentarioRepository.deleteById(comentario_id);
    }

    @DeleteMapping("/receita/{receita_id}")
    public void deletarPostagem(@PathVariable long receita_id) {
        receitaRepository.deleteById(receita_id);
    }
}