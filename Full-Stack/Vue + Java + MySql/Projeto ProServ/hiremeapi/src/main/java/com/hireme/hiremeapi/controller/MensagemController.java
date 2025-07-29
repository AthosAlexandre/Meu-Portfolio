package com.hireme.hiremeapi.controller;

import com.hireme.hiremeapi.model.Mensagem;
import com.hireme.hiremeapi.repository.MensagemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/mensagens")
public class MensagemController {

    private final MensagemRepository mensagemRepository;

    public MensagemController(MensagemRepository mensagemRepository) {
        this.mensagemRepository = mensagemRepository;
    }

    // Criar uma nova mensagem
    @PostMapping
    public ResponseEntity<Mensagem> createMensagem(@RequestBody Mensagem mensagem) {
        // Configura a data de envio automaticamente
        mensagem.setDataEnvio(LocalDateTime.now());
        Mensagem savedMensagem = mensagemRepository.save(mensagem);
        return new ResponseEntity<>(savedMensagem, HttpStatus.CREATED);
    }

    // Buscar uma mensagem por ID
    @GetMapping("/{id}")
    public ResponseEntity<Mensagem> getMensagem(@PathVariable String id) {
        Optional<Mensagem> mensagemOpt = mensagemRepository.findById(id);
        return mensagemOpt.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Listar todas as mensagens
    @GetMapping
    public ResponseEntity<List<Mensagem>> getAllMensagens() {
        List<Mensagem> mensagens = mensagemRepository.findAll();
        return ResponseEntity.ok(mensagens);
    }

    // Atualizar uma mensagem (se for necessário)
    @PutMapping("/{id}")
    public ResponseEntity<Mensagem> updateMensagem(@PathVariable String id, @RequestBody Mensagem mensagemAtualizada) {
        Optional<Mensagem> mensagemOpt = mensagemRepository.findById(id);
        if (mensagemOpt.isPresent()) {
            Mensagem mensagem = mensagemOpt.get();
            mensagem.setConteudo(mensagemAtualizada.getConteudo());
            // Se desejar atualizar a data de envio, defina aqui também.
            Mensagem savedMensagem = mensagemRepository.save(mensagem);
            return ResponseEntity.ok(savedMensagem);
        }
        return ResponseEntity.notFound().build();
    }

    // Deletar uma mensagem
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMensagem(@PathVariable String id) {
        if (mensagemRepository.existsById(id)) {
            mensagemRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
