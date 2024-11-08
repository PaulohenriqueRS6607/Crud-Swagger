package com.example.volei.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.volei.model.Jogador;
import com.example.volei.repository.JogadorRepository;

@Service
public class JogadorService {

    @Autowired
    private JogadorRepository jogadorRepository;

    public List<Jogador> getAllJogadores() {
        return jogadorRepository.findAll();
    }

    public Optional<Jogador> getJogadorById(Long id) {
        return jogadorRepository.findById(id);
    }

    public Jogador createJogador(Jogador jogador) {
        return jogadorRepository.save(jogador);
    }

    public Jogador updateJogador(Long id, Jogador jogadorDetails) {
        if (jogadorRepository.existsById(id)) {
            jogadorDetails.setId(id);
            return jogadorRepository.save(jogadorDetails);
        }
        return null;
    }

    public boolean deleteJogador(Long id) {
        if (jogadorRepository.existsById(id)) {
            jogadorRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
