package com.example.siteReceitas.service;

import com.example.siteReceitas.exception.NotFoundEntityException;
import com.example.siteReceitas.models.UserPadrao;
import com.example.siteReceitas.repository.UserPadraoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPadraoService {

    @Autowired
    private UserPadraoRepository userPadraoRepository;

    public List<UserPadrao> getAllUserPadrao() {
        return userPadraoRepository.findAll();
    }

    public UserPadrao getUserPadraoById(Long id) throws NotFoundEntityException {
        return userPadraoRepository.findById(id)
                .orElseThrow(() -> new NotFoundEntityException("Usuário não Cadastrado"));
    }

    public UserPadrao createUserPadrao(UserPadrao userPadrao) {
        return userPadraoRepository.save(userPadrao);
    }

    public UserPadrao updateUserPadrao(Long id, UserPadrao userPadrao) throws NotFoundEntityException {
        UserPadrao existingUserPadrao = userPadraoRepository.findById(id)
                .orElseThrow(() -> new NotFoundEntityException("Usuário não encontrado"));
        existingUserPadrao.setNome(userPadrao.getNome());
        existingUserPadrao.setEmail(userPadrao.getEmail());
        existingUserPadrao.setId(userPadrao.getId());
        existingUserPadrao.setDataNascimento(userPadrao.getDataNascimento());

        return userPadraoRepository.save(existingUserPadrao);
    }

    public void deleteUserPadrao(Long id) {
        userPadraoRepository.deleteById(id);
    }
}
