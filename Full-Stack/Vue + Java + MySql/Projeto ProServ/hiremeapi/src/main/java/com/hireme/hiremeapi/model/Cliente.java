package com.hireme.hiremeapi.model;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.hireme.hiremeapi.model.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Entity
@Table(name = "cliente")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {

    @Id
    @Column(name = "cliente_id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column
    private String nome;

    @Column
    private String email;

    @Column
    private String senha;

    @Column
    private String telefone;

    @Column
    private String cpf;

    @Column
    private String dataNascimento;

    @Column
    private String sexo;

    @Embedded
    private Endereco endereco;

    @Lob
    @Column
    private byte[] foto;

    @Column(name = "numero_cartao")
    private String numeroCartao;

    @Column(name = "nome_cartao")
    private String nomeNoCartao;

    @Column(name = "validade_cartao")
    private String validade;

    @Column(name = "cvv")
    private String cvv;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
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

    public List<Contrato> getContratos() {
        return contratos;
    }

    public void setContratos(List<Contrato> contratos) {
        this.contratos = contratos;
    }

    public void setSenha(String senha) {
        this.senha = new BCryptPasswordEncoder().encode(senha);
    }

    public boolean validarSenha(String senha) {
        return new BCryptPasswordEncoder().matches(senha, this.senha);
    }

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Contrato> contratos;

    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", sexo='" + sexo + '\'' +
                ", endereco=" + endereco +
                ", foto=" + Arrays.toString(foto) +
                ", numeroCartao='" + numeroCartao + '\'' +
                ", nomeNoCartao='" + nomeNoCartao + '\'' +
                ", validade='" + validade + '\'' +
                ", cvv='" + cvv + '\'' +
                ", contratos=" + contratos +
                '}';
    }
}
