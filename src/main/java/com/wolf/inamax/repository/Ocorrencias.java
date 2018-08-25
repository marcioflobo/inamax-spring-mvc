package com.wolf.inamax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wolf.inamax.model.Ocorrencia;

@Repository
public interface Ocorrencias extends JpaRepository<Ocorrencia, Long> {

	
}
