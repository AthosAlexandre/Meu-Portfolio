package com.hireme.hiremeapi.model;

import com.hireme.hiremeapi.enums.StatusContrato;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "contrato")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Contrato {

    @Id
    @Column(name = "contrato_id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "prestador_id", nullable = false)
    private PrestadorDeServico prestador;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private StatusContrato status; // Valores: PENDENTE, CONFIRMADO, FINALIZADO

    @Column
    private LocalDateTime dataContrato;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public PrestadorDeServico getPrestador() {
        return prestador;
    }

    public void setPrestador(PrestadorDeServico prestador) {
        this.prestador = prestador;
    }

    public LocalDateTime getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(LocalDateTime dataContrato) {
        this.dataContrato = dataContrato;
    }

    public StatusContrato getStatus() {
        return status;
    }

    public void setStatus(StatusContrato status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "id='" + id + '\'' +
                ", cliente=" + cliente +
                ", prestador=" + prestador +
                ", status=" + status +
                ", dataContrato=" + dataContrato +
                '}';
    }
}
