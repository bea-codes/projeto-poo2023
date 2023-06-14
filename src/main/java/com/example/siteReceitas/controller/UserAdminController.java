package com.example.siteReceitas.controller;

import com.example.siteReceitas.models.Comentario;
import com.example.siteReceitas.models.Receita;
import com.example.siteReceitas.models.UserAdmin;
import com.example.siteReceitas.models.UserPadrao;
import com.example.siteReceitas.repository.ComentarioRepository;
import com.example.siteReceitas.repository.ReceitaRepository;
import com.example.siteReceitas.repository.UserAdminRepository;
import com.example.siteReceitas.repository.UserPadraoRepository;
import com.example.siteReceitas.service.UserAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/admin")
public class UserAdminController {

    @Autowired
    private UserAdminService userAdminService;


    // CREATE
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<UserAdmin> createUserAdmin( @RequestBody UserAdmin userAdmin){
        return ResponseEntity.status(HttpStatus.OK).body(
                userAdminService.createUserAdmin(userAdmin)
        );
    }

    // READ
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<UserAdmin>> readAllUserAdmin(){
        return ResponseEntity.status(HttpStatus.OK).body(
                userAdminService.getAllUserAdmin()
        );
    }

    @RequestMapping(value = "{userAdmin_id}", method = RequestMethod.GET)
    public ResponseEntity<Optional<UserAdmin>> readUserAdmin(@PathVariable(value = "userAdmin_id") long id){
        return ResponseEntity.status(HttpStatus.OK).body(userAdminService.getUserAdmin(id));
    }


    // UPDATE
    @RequestMapping(value = "/update/{userAdmin_id}", method = RequestMethod.PUT)
    public ResponseEntity<UserAdmin> updateUserAdmin(@PathVariable(value = "userAdmin_id") long id,
                                                       @RequestBody UserAdmin userAdmin) throws ChangeSetPersister.NotFoundException {
        return ResponseEntity.status(HttpStatus.OK).body(userAdminService.updateUserAdmin(id, userAdmin));
    }

    // DELETE
    @RequestMapping(value = "/delete/{userAdmin_id}")
    public ResponseEntity<Comentario> deleteUserAdmin(@PathVariable(value = "userAdmin_id") long id){
        userAdminService.deleteUserAdmin(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
}