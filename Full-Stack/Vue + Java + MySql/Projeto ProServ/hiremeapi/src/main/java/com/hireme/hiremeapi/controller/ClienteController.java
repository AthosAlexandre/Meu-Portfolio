package com.hireme.hiremeapi.controller;

import com.hireme.hiremeapi.dto.CartaoCreditoDTO;
import com.hireme.hiremeapi.model.Cliente;
import com.hireme.hiremeapi.repository.ClienteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    // Cadastrar um novo Cliente
    @PostMapping
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
        Cliente savedCliente = clienteRepository.save(cliente);
        return new ResponseEntity<>(savedCliente, HttpStatus.CREATED);
    }

    // Buscar um Cliente por ID
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getCliente(@PathVariable String id) {
        Optional<Cliente> clienteOpt = clienteRepository.findById(id);
        return clienteOpt.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Listar todos os Clientes
    @GetMapping
    public ResponseEntity<List<Cliente>> getAllClientes() {
        List<Cliente> clientes = clienteRepository.findAll();
        return ResponseEntity.ok(clientes);
    }

    // Atualizar dados de um Cliente
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable String id, @RequestBody Cliente clienteAtualizado) {
        Optional<Cliente> clienteOpt = clienteRepository.findById(id);
        if (clienteOpt.isPresent()) {
            Cliente cliente = clienteOpt.get();
            // Atualize os campos conforme necessário
            cliente.setNome(clienteAtualizado.getNome());
            cliente.setEmail(clienteAtualizado.getEmail());
            cliente.setTelefone(clienteAtualizado.getTelefone());
            // Atualize outros campos, se necessário...
            Cliente savedCliente = clienteRepository.save(cliente);
            return ResponseEntity.ok(savedCliente);
        }
        return ResponseEntity.notFound().build();
    }

    // Excluir um Cliente
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable String id) {
        if (clienteRepository.existsById(id)) {
            clienteRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    // Atualizar informações de pagamento (Cartão de Crédito)
    @PutMapping("/{id}/cartao")
    public ResponseEntity<Cliente> updateCartaoCredito(@PathVariable String id, @RequestBody CartaoCreditoDTO cartaoDTO) {
        Optional<Cliente> clienteOpt = clienteRepository.findById(id);
        if (clienteOpt.isPresent()) {
            Cliente cliente = clienteOpt.get();
            cliente.setNumeroCartao(cartaoDTO.getNumero());
            cliente.setNomeNoCartao(cartaoDTO.getNomeNoCartao());
            cliente.setValidade(cartaoDTO.getValidade());
            cliente.setCvv(cartaoDTO.getCvv());
            Cliente savedCliente = clienteRepository.save(cliente);
            return ResponseEntity.ok(savedCliente);
        }
        return ResponseEntity.notFound().build();
    }

    // Endpoint para upload de foto (imagem) do Cliente
    @PostMapping("/{id}/upload-foto")
    public ResponseEntity<Void> uploadFoto(@PathVariable String id,
                                           @RequestParam("file") MultipartFile file) throws IOException {
        Optional<Cliente> clienteOpt = clienteRepository.findById(id);
        if (clienteOpt.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Cliente cliente = clienteOpt.get();
        cliente.setFoto(file.getBytes());
        clienteRepository.save(cliente);
        return ResponseEntity.ok().build();
    }
}
