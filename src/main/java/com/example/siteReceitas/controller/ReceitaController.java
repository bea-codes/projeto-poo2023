package com.example.siteReceitas.controller;


import com.example.siteReceitas.models.Receita;
import com.example.siteReceitas.repository.ReceitaRepository;

import com.example.siteReceitas.service.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/receita")
public class ReceitaController {
    /*
    * CRUD CHECKLIST
    * 1 - CREATE -> DONE!
    * 2 - READ   -> DONE!
    * 3 - UPDATE -> DONE!
    * 4 - DELETE -> DONE!
    * */

    @Autowired
    private ReceitaService receitaService;

    //CREATE METHOD
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<Receita> createReceita(@RequestBody Receita receita){
        return ResponseEntity.status(HttpStatus.OK).body(receitaService.createReceita(receita));
    }

    //READ METHOD
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<Receita>> readReceita(){
        return ResponseEntity.status(HttpStatus.OK).body(receitaService.getAllReceitas());
    }

    //UPDATE METHOD
    @RequestMapping(value = "/update/{receita_id}", method = RequestMethod.PUT)
    public ResponseEntity<Receita> updateReceita(
            @PathVariable(value = "receita_id") long id,
            @RequestBody Receita receita
    ) throws ChangeSetPersister.NotFoundException
    {
        return ResponseEntity.status(HttpStatus.OK).body(receitaService.updateReceita(id, receita));
    }

    //DELETE METHOD
    @RequestMapping(value = "/delete/{receita_id}", method = RequestMethod.DELETE)
    public ResponseEntity<Receita> deleteReceita(
            @PathVariable(value = "receita_id") long id){
        receitaService.deleteReceita(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }







}

