package com.hireme.hiremeapi.repository;

import com.hireme.hiremeapi.model.Mensagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MensagemRepository extends JpaRepository<Mensagem, String> {
}
