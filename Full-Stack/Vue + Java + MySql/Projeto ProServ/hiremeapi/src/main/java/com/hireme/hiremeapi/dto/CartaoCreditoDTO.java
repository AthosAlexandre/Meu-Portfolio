package com.hireme.hiremeapi.dto;


public class CartaoCreditoDTO {
    private String numero;
    private String nomeNoCartao;
    private String validade;  // Ex.: "12/2026"
    private String cvv;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNomeNoCartao() {
        return nomeNoCartao;
    }

    public void setNomeNoCartao(String nomeNoCartao) {
        this.nomeNoCartao = nomeNoCartao;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "CartaoCreditoDTO{" +
                "numero='" + numero + '\'' +
                ", nomeNoCartao='" + nomeNoCartao + '\'' +
                ", validade='" + validade + '\'' +
                ", cvv='" + cvv + '\'' +
                '}';
    }
}
