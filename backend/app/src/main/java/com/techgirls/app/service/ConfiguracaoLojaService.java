package com.techgirls.app.service;

import com.techgirls.app.repository.ConfiguracaoLojaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConfiguracaoLojaService {

    private final ConfiguracaoLojaRepository configuracaoLojaRepository;

}