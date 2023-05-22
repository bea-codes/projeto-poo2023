package com.example.siteReceitas.controller;


import com.example.siteReceitas.dto.ReceitaDto;
import com.example.siteReceitas.models.Receita;
import com.example.siteReceitas.repository.ReceitaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/receita")

public class ReceitaController {

    @Autowired
    private ReceitaRepository receitaRepository;

    private ReceitaDto toDTO(Receita receita){

        return new ReceitaDto(receita.getId(),
                receita.getAutor(),
                receita.getTitulo(),
                receita.getDescricao(),
                receita.getInstrucoesPreparoPasso1(),
                receita.getInstrucosPreparoPasso2(),
                receita.getTempoDePreparo(),
                receita.getInfoAdicional(),
                receita.getDataDePostagem(),
                receita.getIngredientes(),
                receita.getComentarios());
    }

    private Receita toModel(ReceitaDto receitaDto){
        Receita receita = new Receita();
        receita.setId(receita.getId());
        receita.setAutor(receitaDto.getAutor());
        receita.setTitulo(receitaDto.getTitulo());
        receita.setDescricao(receitaDto.getDescricao());
        receita.setInstrucoesPreparoPasso1(receitaDto.getInstrucoesPreparoPasso1());
        receita.setInstrucosPreparoPasso2(receitaDto.getInstrucosPreparoPasso2());
        receita.setTempoDePreparo(receitaDto.getTempoDePreparo());
        receita.setInfoAdicional(receitaDto.getInfoAdicional());
        receita.setDataDePostagem(receitaDto.getDataDePostagem());
        receita.setIngredientes(receitaDto.getIngredientes());
        receita.setComentarios(receitaDto.getComentarios());

        return receita;

    }

    @GetMapping ("/receita")

    public ResponseEntity<List<ReceitaDto>> findAll(){
        List<Receita> receitas = receitaRepository.findAll();
        List<ReceitaDto> receitaDtos = receitas.stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
        return ResponseEntity.status(HttpStatus.OK).body(receitaDtos);
    }

    @GetMapping("/receita/{id}")

    public ResponseEntity<ReceitaDto> finById(@PathVariable Long id){
        Optional<Receita> receita = receitaRepository.findById(id);
        if (receita.isPresent()) {
            ReceitaDto receitaDto = toDTO(receita.get());
            return ResponseEntity.status(HttpStatus.OK).body(receitaDto);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping("/receita")
    public ResponseEntity<ReceitaDto> create(@RequestBody ReceitaDto receitaDto){
        Receita receita = toModel(receitaDto);
        receitaRepository.save(receita);
        ReceitaDto createReceitadto = toDTO(receita);
        return ResponseEntity.status(HttpStatus.CREATED).body(createReceitadto);
    }

    @PostMapping("receita/{id}")

    public ResponseEntity<ReceitaDto> update (@PathVariable Long id, @RequestBody ReceitaDto receitaDto){
        Optional<Receita> receitaOptional = receitaRepository.findById(id);
        if (receitaOptional.isPresent()) {
            Receita receita = receitaOptional.get();
            receita.setAutor(receitaDto.getAutor());
            receita.setTitulo(receitaDto.getTitulo());
            receita.setDescricao(receitaDto.getDescricao());
            receita.setInstrucoesPreparoPasso1(receitaDto.getInstrucoesPreparoPasso1());
            receita.setInstrucosPreparoPasso2(receitaDto.getInstrucosPreparoPasso2());
            receita.setTempoDePreparo(receitaDto.getTempoDePreparo());
            receita.setInfoAdicional(receitaDto.getInfoAdicional());
            receita.setDataDePostagem(receitaDto.getDataDePostagem());
            receita.setIngredientes(receitaDto.getIngredientes());
            receita.setComentarios(receitaDto.getComentarios());
            receitaRepository.save(receita);
            ReceitaDto updateReceitadto = toDTO(receita);
            return ResponseEntity.status(HttpStatus.OK).body(updateReceitadto);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
