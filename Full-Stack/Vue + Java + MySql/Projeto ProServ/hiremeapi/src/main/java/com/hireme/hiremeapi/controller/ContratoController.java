package com.hireme.hiremeapi.controller;

import com.hireme.hiremeapi.model.Contrato;
import com.hireme.hiremeapi.repository.ContratoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/contratos")
public class ContratoController {

    private final ContratoRepository contratoRepository;

    public ContratoController(ContratoRepository contratoRepository) {
        this.contratoRepository = contratoRepository;
    }

    // Criar um novo contrato
    @PostMapping
    public ResponseEntity<Contrato> createContrato(@RequestBody Contrato contrato) {
        Contrato savedContrato = contratoRepository.save(contrato);
        return new ResponseEntity<>(savedContrato, HttpStatus.CREATED);
    }

    // Buscar contrato por ID
    @GetMapping("/{id}")
    public ResponseEntity<Contrato> getContrato(@PathVariable String id) {
        Optional<Contrato> contratoOpt = contratoRepository.findById(id);
        return contratoOpt.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Listar todos os contratos
    @GetMapping
    public ResponseEntity<List<Contrato>> getAllContratos() {
        List<Contrato> contratos = contratoRepository.findAll();
        return ResponseEntity.ok(contratos);
    }

    // Atualizar um contrato existente
    @PutMapping("/{id}")
    public ResponseEntity<Contrato> updateContrato(@PathVariable String id, @RequestBody Contrato contratoAtualizado) {
        Optional<Contrato> contratoOpt = contratoRepository.findById(id);
        if (contratoOpt.isPresent()) {
            Contrato contrato = contratoOpt.get();
            // Atualize os campos que desejar
            contrato.setStatus(contratoAtualizado.getStatus());
            contrato.setDataContrato(contratoAtualizado.getDataContrato());
            // Atualize outras propriedades conforme a necessidade
            Contrato savedContrato = contratoRepository.save(contrato);
            return ResponseEntity.ok(savedContrato);
        }
        return ResponseEntity.notFound().build();
    }

    // Deletar um contrato
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContrato(@PathVariable String id) {
        if (contratoRepository.existsById(id)) {
            contratoRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
