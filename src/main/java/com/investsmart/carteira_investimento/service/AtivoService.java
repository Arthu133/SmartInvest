package com.investsmart.carteira_investimento.service;

import com.investsmart.carteira_investimento.model.Ativo;
import com.investsmart.carteira_investimento.model.Carteira;
import com.investsmart.carteira_investimento.repository.AtivoRepository;
import com.investsmart.carteira_investimento.repository.CarteiraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtivoService {

    @Autowired
    private AtivoRepository ativoRepository;

    @Autowired
    private CarteiraRepository carteiraRepository;

    public Ativo adicionarAtivo(Long carteiraId, Ativo ativo) {
        Carteira carteira = carteiraRepository.findById(carteiraId)
                .orElseThrow(() -> new RuntimeException("Carteira não encontrada"));
        ativo.setCarteira(carteira);
        return ativoRepository.save(ativo);
    }
}
