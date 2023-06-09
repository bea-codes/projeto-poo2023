package com.example.siteReceitas.service;

import com.example.siteReceitas.models.UserPadrao;
import com.example.siteReceitas.repository.UserPadraoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserPadraoService {

    @Autowired
    private UserPadraoRepository userPadraoRepository;
    public List<UserPadrao> getAllUserPadrao(){
        return userPadraoRepository.findAll();
    }

    public Optional<UserPadrao> getUserPadrao(long id){
        return userPadraoRepository.findById(id);
    }

    public UserPadrao createUserPadrao(UserPadrao userPadrao){
        return userPadraoRepository.save(userPadrao);
    }

    public void deleteUserPadrao(long id){
        userPadraoRepository.deleteById(id);
    }

    public UserPadrao updateUserPadrao(long id, UserPadrao userPadrao) throws ChangeSetPersister.NotFoundException {
        UserPadrao userExistente = userPadraoRepository.findById(id).orElseThrow(() -> new ChangeSetPersister.NotFoundException());
        userExistente.setNome(userPadrao.getNome());
        userExistente.setEmail(userPadrao.getEmail());
        userExistente.setDataNascimento(userPadrao.getDataNascimento());
        return userPadraoRepository.save(userExistente);
    }

}
