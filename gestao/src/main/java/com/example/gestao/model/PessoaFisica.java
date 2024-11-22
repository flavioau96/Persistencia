package com.example.gestao.model;

import java.util.List;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class PessoaFisica extends Usuario {
    private String cpf;
    private LocalDate dataNascimento;

    @ManyToMany
    private List<Empresa> empresas;
}
