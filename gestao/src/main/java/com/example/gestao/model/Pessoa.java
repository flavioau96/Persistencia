package com.example.gestao.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public class Pessoa {
    private Long id;
    private String nome;
    private String endereco;
}
