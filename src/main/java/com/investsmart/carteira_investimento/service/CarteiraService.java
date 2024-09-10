package com.investsmart.carteira_investimento.service;

import com.investsmart.carteira_investimento.model.Carteira;
import com.investsmart.carteira_investimento.model.Usuario;
import com.investsmart.carteira_investimento.repository.CarteiraRepository;
import com.investsmart.carteira_investimento.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarteiraService {

    @Autowired
    private CarteiraRepository carteiraRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Carteira> listarCarteirasPorUsuario(Long usuarioId) {
        return carteiraRepository.findByUsuarioId(usuarioId);
    }

    public Carteira criarCarteira(Long usuarioId, Carteira carteira) {
        Usuario usuario = usuarioRepository.findById(usuarioId)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        carteira.setUsuario(usuario);
        return carteiraRepository.save(carteira);
    }
}
