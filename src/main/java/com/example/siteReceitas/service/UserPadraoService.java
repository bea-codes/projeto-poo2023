package com.example.siteReceitas.service;

import com.example.siteReceitas.models.UserPadrao;
import com.example.siteReceitas.repository.UserPadraoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserPadraoService {

    @Autowired
    private UserPadraoRepository userPadraoRepository;
}
