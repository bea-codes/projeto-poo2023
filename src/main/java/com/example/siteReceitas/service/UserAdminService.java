package com.example.siteReceitas.service;

import com.example.siteReceitas.repository.UserAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAdminService {

    @Autowired
    private UserAdminRepository userAdminRepository;
}
