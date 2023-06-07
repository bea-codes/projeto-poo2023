package com.example.siteReceitas.service;

import com.example.siteReceitas.exception.NotFoundEntityException;
import com.example.siteReceitas.models.UserAdmin;
import com.example.siteReceitas.repository.UserAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAdminService {

    @Autowired
    private UserAdminRepository userAdminRepository;

    public List<UserAdmin> getAllUserAdmins() {
        return userAdminRepository.findAll();
    }

    public UserAdmin getUserAdminById(Long id) throws NotFoundEntityException {
        return userAdminRepository.findById(id)
                .orElseThrow(() -> new NotFoundEntityException("Admin User not found"));
    }

    public UserAdmin createUserAdmin(UserAdmin userAdmin) {
        return userAdminRepository.save(userAdmin);
    }

    public UserAdmin updateUserAdmin(Long id, UserAdmin userAdmin) throws NotFoundEntityException {
        UserAdmin existingUserAdmin = userAdminRepository.findById(id)
                .orElseThrow(() -> new NotFoundEntityException("Admin User not found"));
        existingUserAdmin.setNome(userAdmin.getNome());
        existingUserAdmin.setEmail(userAdmin.getEmail());
        existingUserAdmin.setId(userAdmin.getId());
        existingUserAdmin.setDataNascimento(userAdmin.getDataNascimento());

        return userAdminRepository.save(existingUserAdmin);
    }

    public void deleteUserAdmin(Long id) {
        userAdminRepository.deleteById(id);
    }
}
