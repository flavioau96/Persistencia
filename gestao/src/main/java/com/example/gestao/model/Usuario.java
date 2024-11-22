package com.example.gestao.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Usuario extends Pessoa {
    private String email;
    private String senha;
}
