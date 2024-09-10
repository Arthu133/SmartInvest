package com.investsmart.carteira_investimento.repository;

import com.investsmart.carteira_investimento.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
