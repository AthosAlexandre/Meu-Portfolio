package com.hireme.hiremeapi.model;

import com.hireme.hiremeapi.enums.Servico;
import com.hireme.hiremeapi.model.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Arrays;
import java.util.List;

@Entity
@Table(name = "prestadordeservico")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PrestadorDeServico {

    @Id
    @Column(name = "prestador_id")
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

    @Enumerated(EnumType.STRING)
    @Column(name = "servico_aprestar")
    private Servico servicoAprestar;

    @Lob
    @Column
    private byte[] foto;

    @Column(name = "pix_key")
    private String pixKey;

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

    public Servico getServicoAprestar() {
        return servicoAprestar;
    }

    public void setServicoAprestar(Servico servicoAprestar) {
        this.servicoAprestar = servicoAprestar;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String getPixKey() {
        return pixKey;
    }

    public void setPixKey(String pixKey) {
        this.pixKey = pixKey;
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

    @OneToMany(mappedBy = "prestador", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Contrato> contratos;

    @Override
    public String toString() {
        return "PrestadorDeServico{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", sexo='" + sexo + '\'' +
                ", endereco=" + endereco +
                ", servicoAprestar=" + servicoAprestar +
                ", foto=" + Arrays.toString(foto) +
                ", pixKey='" + pixKey + '\'' +
                ", contratos=" + contratos +
                '}';
    }
}
