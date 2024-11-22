package com.example.gestao.model;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Empresa {
    private Long id;
    private String nome;

    @ManyToMany(mappedBy = "empresas")
    private List<PessoaFisica> pessoaFisicas;

    @OneToMany(mappedBy = "empresa")
    private List<PessoaJuridica> pessoaJuridicas;
}
