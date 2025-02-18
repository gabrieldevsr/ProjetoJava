package com.accenture.academico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.accenture.academico.model.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long>{

}
