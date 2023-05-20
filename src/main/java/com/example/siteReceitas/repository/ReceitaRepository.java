package com.example.siteReceitas.repository;

import com.example.siteReceitas.models.Receita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceitaRepository extends JpaRepository<Receita, Long> {
}
