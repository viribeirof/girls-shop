package com.techgirls.app.repository;

import com.techgirls.app.entity.ConfiguracaoLoja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfiguracaoLojaRepository extends JpaRepository<ConfiguracaoLoja, Long> {
}