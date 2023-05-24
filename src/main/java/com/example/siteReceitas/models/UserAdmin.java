package com.example.siteReceitas.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "user_admin")
public class UserAdmin extends UserAbstract {
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
