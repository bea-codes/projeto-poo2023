package com.example.siteReceitas.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
public class UserPadrao extends UserAbstract{
    @Override
    public void enviarComentario() {
        // TODO Auto-generated method stub

    }

    @Override
    public void enviarPostagem() {
        // TODO Auto-generated method stub

    }

    @Override
    public void excluirComentario() {
        // TODO Auto-generated method stub
    }

    @Override
    public void excluirPostagem() {
        // TODO Auto-generated method stub
    }

}
