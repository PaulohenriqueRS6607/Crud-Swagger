package com.example.volei.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.volei.model.Jogador;
import com.example.volei.service.JogadorService;

@RestController
@RequestMapping("volei")
public class JogadorController {
	
    @Autowired
    private JogadorService jogadorService;
    
    @GetMapping("/mostrar")
    public List<Jogador> getAllJogadores() {
        return jogadorService.getAllJogadores();
    }

    @GetMapping("/mostrar/{id}")
    public Optional<Jogador> getJogadorById(@PathVariable Long id) {
        return jogadorService.getJogadorById(id);
    }

    @PostMapping("/cadastrar")
    public Jogador createJogador(@RequestBody Jogador jogador) {
        return jogadorService.createJogador(jogador);
    }

    @PutMapping("/atualizar/{id}")
    public Jogador updateJogador(@PathVariable Long id, @RequestBody Jogador jogador) {
        return jogadorService.updateJogador(id, jogador);
    }

    @DeleteMapping("deletar/{id}")
    public boolean deleteJogador(@PathVariable Long id) {
        return jogadorService.deleteJogador(id);
    }
}
