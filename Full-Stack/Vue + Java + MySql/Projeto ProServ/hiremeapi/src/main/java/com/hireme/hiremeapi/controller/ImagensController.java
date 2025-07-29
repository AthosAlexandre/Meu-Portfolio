package com.hireme.hiremeapi.controller;

import com.hireme.hiremeapi.model.Cliente;
import com.hireme.hiremeapi.model.PrestadorDeServico;
import com.hireme.hiremeapi.repository.ClienteRepository;
import com.hireme.hiremeapi.repository.PrestadorDeServicoRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/imagens")
public class ImagensController {

    private final ClienteRepository clienteRepository;
    private final PrestadorDeServicoRepository prestadorRepository;

    public ImagensController(ClienteRepository clienteRepository,
                             PrestadorDeServicoRepository prestadorRepository) {
        this.clienteRepository = clienteRepository;
        this.prestadorRepository = prestadorRepository;
    }

    // Endpoint para retornar a foto de um Cliente
    @GetMapping("/cliente/{id}")
    public ResponseEntity<byte[]> getClienteImagem(@PathVariable String id) {
        Optional<Cliente> clienteOpt = clienteRepository.findById(id);
        if (clienteOpt.isEmpty() || clienteOpt.get().getFoto() == null) {
            return ResponseEntity.notFound().build();
        }
        Cliente cliente = clienteOpt.get();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG); // Ajuste conforme o formato real da imagem
        headers.setContentLength(cliente.getFoto().length);
        return new ResponseEntity<>(cliente.getFoto(), headers, HttpStatus.OK);
    }

    // Endpoint para retornar a foto de um Prestador de Serviço
    @GetMapping("/prestador/{id}")
    public ResponseEntity<byte[]> getPrestadorImagem(@PathVariable String id) {
        Optional<PrestadorDeServico> prestadorOpt = prestadorRepository.findById(id);
        if (prestadorOpt.isEmpty() || prestadorOpt.get().getFoto() == null) {
            return ResponseEntity.notFound().build();
        }
        PrestadorDeServico prestador = prestadorOpt.get();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG); // Ajuste conforme o formato real da imagem
        headers.setContentLength(prestador.getFoto().length);
        return new ResponseEntity<>(prestador.getFoto(), headers, HttpStatus.OK);
    }
}
