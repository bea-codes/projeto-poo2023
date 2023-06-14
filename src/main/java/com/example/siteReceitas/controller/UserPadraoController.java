package com.example.siteReceitas.controller;

import com.example.siteReceitas.models.Comentario;
import com.example.siteReceitas.models.Receita;
import com.example.siteReceitas.models.UserAdmin;
import com.example.siteReceitas.models.UserPadrao;
import com.example.siteReceitas.repository.ComentarioRepository;
import com.example.siteReceitas.repository.ReceitaRepository;
import com.example.siteReceitas.repository.UserPadraoRepository;
import com.example.siteReceitas.service.UserPadraoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
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
    private UserPadraoService userPadraoService;


    // CREATE
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<UserPadrao> createUserAdmin(@RequestBody UserPadrao userPadrao){
        return ResponseEntity.status(HttpStatus.OK).body(
                userPadraoService.createUserPadrao(userPadrao)
        );
    }

    // READ
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<UserPadrao>> readAllUserAdmin(){
        return ResponseEntity.status(HttpStatus.OK).body(
                userPadraoService.getAllUserPadrao()
        );
    }

    @RequestMapping(value = "{userpadrao_id}", method = RequestMethod.GET)
    public ResponseEntity<Optional<UserPadrao>> readUserAdmin(@PathVariable(value = "userpadrao_id") long id){
        return ResponseEntity.status(HttpStatus.OK).body(userPadraoService.getUserPadrao(id));
    }


    // UPDATE
    @RequestMapping(value = "/update/{userpadrao_id}", method = RequestMethod.PUT)
    public ResponseEntity<UserPadrao> updateUserAdmin(@PathVariable(value = "userpadrao_id") long id,
                                                     @RequestBody UserPadrao userPadrao) throws ChangeSetPersister.NotFoundException {
        return ResponseEntity.status(HttpStatus.OK).body(userPadraoService.updateUserPadrao(id, userPadrao));
    }

    // DELETE
    @RequestMapping(value = "/delete/{userpadrao_id}")
    public ResponseEntity<Comentario> deleteUserAdmin(@PathVariable(value = "userpadrao_id") long id){
        userPadraoService.deleteUserPadrao(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
}