package com.investsmart.carteira_investimento.model;

import jakarta.persistence.*;

@Entity
public class Ativo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Double quantidade;
    private Double precoCompra;

    @ManyToOne
    @JoinColumn(name = "carteira_id")
    private Carteira carteira;

    // Getters e Setters
}
