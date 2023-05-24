package com.example.siteReceitas.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
public class UserPadrao extends UserAbstract{
    @Override
    public void enviarPostagem() {

    }

    @Override
    public void excluirPostagem() {

    }

    @Override
    public void enviarComentario() {

    }

    @Override
    public void excluirComentario() {

    }

}
