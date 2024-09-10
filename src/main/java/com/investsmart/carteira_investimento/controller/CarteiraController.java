package com.investsmart.carteira_investimento.controller;

import com.investsmart.carteira_investimento.model.Carteira;
import com.investsmart.carteira_investimento.service.CarteiraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carteiras")
public class CarteiraController {

    @Autowired
    private CarteiraService carteiraService;

    @GetMapping("/usuario/{usuarioId}")
    public List<Carteira> listarCarteirasPorUsuario(@PathVariable Long usuarioId) {
        return carteiraService.listarCarteirasPorUsuario(usuarioId);
    }

    @PostMapping("/usuario/{usuarioId}")
    public Carteira criarCarteira(@PathVariable Long usuarioId, @RequestBody Carteira carteira) {
        return carteiraService.criarCarteira(usuarioId, carteira);
    }
}
