package com.hireme.hiremeapi.repository;

import com.hireme.hiremeapi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
}
