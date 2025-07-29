package com.hireme.hiremeapi.controller;

import com.hireme.hiremeapi.dto.PixDTO;
import com.hireme.hiremeapi.model.PrestadorDeServico;
import com.hireme.hiremeapi.repository.PrestadorDeServicoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/prestadores")
public class PrestadorDeServicoController {

    private final PrestadorDeServicoRepository prestadorRepository;

    public PrestadorDeServicoController(PrestadorDeServicoRepository prestadorRepository) {
        this.prestadorRepository = prestadorRepository;
    }

    // Cadastrar um novo Prestador de Serviço (espera JSON)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PrestadorDeServico> createPrestador(@RequestBody PrestadorDeServico prestador) {
        PrestadorDeServico savedPrestador = prestadorRepository.save(prestador);
        return new ResponseEntity<>(savedPrestador, HttpStatus.CREATED);
    }

    // Buscar um Prestador por ID
    @GetMapping("/{id}")
    public ResponseEntity<PrestadorDeServico> getPrestador(@PathVariable String id) {
        Optional<PrestadorDeServico> prestadorOpt = prestadorRepository.findById(id);
        return prestadorOpt.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Listar todos os Prestadores
    @GetMapping
    public ResponseEntity<List<PrestadorDeServico>> getAllPrestadores() {
        List<PrestadorDeServico> prestadores = prestadorRepository.findAll();
        return ResponseEntity.ok(prestadores);
    }

    // Atualizar dados de um Prestador (espera JSON)
    @PutMapping("/{id}")
    public ResponseEntity<PrestadorDeServico> updatePrestador(@PathVariable String id,
                                                              @RequestBody PrestadorDeServico prestadorAtualizado) {
        Optional<PrestadorDeServico> prestadorOpt = prestadorRepository.findById(id);
        if (prestadorOpt.isPresent()) {
            PrestadorDeServico prestador = prestadorOpt.get();
            prestador.setNome(prestadorAtualizado.getNome());
            prestador.setEmail(prestadorAtualizado.getEmail());
            prestador.setTelefone(prestadorAtualizado.getTelefone());
            // Atualize outros campos conforme necessário...
            PrestadorDeServico savedPrestador = prestadorRepository.save(prestador);
            return ResponseEntity.ok(savedPrestador);
        }
        return ResponseEntity.notFound().build();
    }

    // Excluir um Prestador
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePrestador(@PathVariable String id) {
        if (prestadorRepository.existsById(id)) {
            prestadorRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    // Atualizar chave PIX do Prestador
    @PutMapping("/{id}/pix")
    public ResponseEntity<PrestadorDeServico> updatePix(@PathVariable String id, @RequestBody PixDTO pixDTO) {
        Optional<PrestadorDeServico> prestadorOpt = prestadorRepository.findById(id);
        if (prestadorOpt.isPresent()) {
            PrestadorDeServico prestador = prestadorOpt.get();
            prestador.setPixKey(pixDTO.getPixKey());
            PrestadorDeServico savedPrestador = prestadorRepository.save(prestador);
            return ResponseEntity.ok(savedPrestador);
        }
        return ResponseEntity.notFound().build();
    }

    // Endpoint para upload de foto (imagem) do Prestador
    @PostMapping("/{id}/upload-foto")
    public ResponseEntity<Void> uploadFoto(@PathVariable String id,
                                           @RequestParam("file") MultipartFile file) throws IOException {
        Optional<PrestadorDeServico> prestadorOpt = prestadorRepository.findById(id);
        if (prestadorOpt.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        PrestadorDeServico prestador = prestadorOpt.get();
        prestador.setFoto(file.getBytes());
        prestadorRepository.save(prestador);
        return ResponseEntity.ok().build();
    }

}
