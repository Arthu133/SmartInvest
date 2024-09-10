package com.investsmart.carteira_investimento.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Carteira {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @OneToMany(mappedBy = "carteira", cascade = CascadeType.ALL)
    private List<Ativo> ativos;

    // Getters e Setters
}
