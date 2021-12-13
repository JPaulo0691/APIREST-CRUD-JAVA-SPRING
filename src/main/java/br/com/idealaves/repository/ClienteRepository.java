package br.com.idealaves.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.idealaves.model.Cliente;

@Repository

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	
}
