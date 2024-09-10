package com.investsmart.carteira_investimento.controller;

import com.investsmart.carteira_investimento.model.Ativo;
import com.investsmart.carteira_investimento.service.AtivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ativos")
public class AtivoController {

    @Autowired
    private AtivoService ativoService;

    @PostMapping("/carteira/{carteiraId}")
    public Ativo adicionarAtivo(@PathVariable Long carteiraId, @RequestBody Ativo ativo) {
        return AtivoService.adicionarAtivo(carteiraId, ativo);
    }
}
