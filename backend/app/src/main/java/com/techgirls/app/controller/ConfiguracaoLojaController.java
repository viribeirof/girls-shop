package com.techgirls.app.controller;

import com.techgirls.app.service.ConfiguracaoLojaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/configuracao-loja")
@RequiredArgsConstructor
public class ConfiguracaoLojaController {

    private final ConfiguracaoLojaService configuracaoLojaService;

}