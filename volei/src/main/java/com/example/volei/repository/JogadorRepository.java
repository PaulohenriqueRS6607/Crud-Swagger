package com.example.volei.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.volei.model.Jogador;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {
}
