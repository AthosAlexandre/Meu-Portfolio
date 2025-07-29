package com.hireme.hiremeapi.model;

import com.hireme.hiremeapi.model.Cliente;
import com.hireme.hiremeapi.model.Contrato;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "mensagem")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Mensagem {

    @Id
    @Column(name = "mensagem_id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "contrato_id", nullable = false)
    private Contrato contrato;

    // Ajustado: Remetente é um Cliente, então o join column passa a ser "cliente_id"
    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente remetente;

    @Column(columnDefinition = "TEXT")
    private String conteudo;

    @Column
    private LocalDateTime dataEnvio;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Cliente getRemetente() {
        return remetente;
    }

    public void setRemetente(Cliente remetente) {
        this.remetente = remetente;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDateTime getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(LocalDateTime dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    @Override
    public String toString() {
        return "Mensagem{" +
                "id='" + id + '\'' +
                ", contrato=" + contrato +
                ", remetente=" + remetente +
                ", conteudo='" + conteudo + '\'' +
                ", dataEnvio=" + dataEnvio +
                '}';
    }
}
