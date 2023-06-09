package com.example.siteReceitas.service;

import com.example.siteReceitas.models.UserAdmin;
import com.example.siteReceitas.repository.UserAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserAdminService {

    @Autowired
    private UserAdminRepository userAdminRepository;

    public List<UserAdmin> getAllUserAdmin(){
        return userAdminRepository.findAll();
    }

    public Optional<UserAdmin> getUserAdmin(long id){
        return userAdminRepository.findById(id);
    }

    public UserAdmin createUserAdmin(UserAdmin userAdmin){
        return userAdminRepository.save(userAdmin);
    }

    public void deleteUserAdmin(long id){
        userAdminRepository.deleteById(id);
    }

    public UserAdmin updateUserAdmin(long id, UserAdmin userAdmin) throws ChangeSetPersister.NotFoundException {
        UserAdmin userExistente = userAdminRepository.findById(id).orElseThrow(() -> new ChangeSetPersister.NotFoundException());
        userExistente.setNome(userAdmin.getNome());
        userExistente.setEmail(userAdmin.getEmail());
        userExistente.setDataNascimento(userAdmin.getDataNascimento());
        return userAdminRepository.save(userExistente);
    }

}
