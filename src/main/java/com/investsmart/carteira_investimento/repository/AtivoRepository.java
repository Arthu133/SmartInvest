package com.investsmart.carteira_investimento.repository;

import com.investsmart.carteira_investimento.model.Ativo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtivoRepository extends JpaRepository<Ativo, Long> {
}
