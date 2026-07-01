package com.techgirls.app.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "configuracao_loja")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ConfiguracaoLoja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_loja", nullable = false, length = 100)
    private String nomeLoja;

    @Column(name = "telefone_whatsapp", nullable = false, length = 20)
    private String telefoneWhatsapp;

    @Column(name = "chave_pix", nullable = false, length = 255)
    private String chavePix;

    @Column(name = "qr_code_pix", nullable = false, length = 500)
    private String qrCodePix;
}