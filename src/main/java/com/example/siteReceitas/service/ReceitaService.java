package com.example.siteReceitas.service;

import com.example.siteReceitas.models.Receita;
import com.example.siteReceitas.repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceitaService {

    @Autowired
    private ReceitaRepository receitaRepository;

    public Receita createReceita(Receita receita){
        return receitaRepository.save(receita);
    }

    public List<Receita> getAllReceitas(){
        return receitaRepository.findAll();
    }

    public Receita updateReceita(Long id, Receita receita) throws ChangeSetPersister.NotFoundException{
        Receita receitaExistente = receitaRepository.findById(id).orElseThrow(() -> new ChangeSetPersister.NotFoundException());
        receitaExistente.setId(receita.getId());
        receitaExistente.setAutor(receita.getAutor());
        receitaExistente.setComentarios(receita.getComentarios());
        receitaExistente.setDescricao(receita.getDescricao());
        receitaExistente.setTitulo(receita.getTitulo());
        receitaExistente.setDataDePostagem(receita.getDataDePostagem());
        receitaExistente.setTempoDePreparo(receita.getTempoDePreparo());
        receitaExistente.setInstrucoesPreparoPasso1(receita.getInstrucoesPreparoPasso1());
        receitaExistente.setInstrucosPreparoPasso2(receita.getInstrucosPreparoPasso2());
        receitaExistente.setIngredientes(receita.getIngredientes());
        receitaExistente.setInfoAdicional(receita.getInfoAdicional());

        return receitaRepository.save(receitaExistente);
    }

    public void deleteReceita(Long id){
        receitaRepository.deleteById(id);
    }
}
