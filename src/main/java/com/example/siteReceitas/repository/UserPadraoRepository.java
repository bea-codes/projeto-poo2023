package com.example.siteReceitas.repository;

import com.example.siteReceitas.models.UserPadrao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPadraoRepository extends JpaRepository<UserPadrao, Long> {

}
