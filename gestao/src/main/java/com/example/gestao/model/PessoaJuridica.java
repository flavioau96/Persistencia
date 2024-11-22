package com.example.gestao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class PessoaJuridica extends Usuario {
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;

    @ManyToOne
    private Empresa empresa;
}
