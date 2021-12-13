package br.com.idealaves.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.idealaves.model.Cliente;
import br.com.idealaves.repository.ClienteRepository;


@RestController
@RequestMapping("/api")

public class ClienteController {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	
	// consulta de clientes	
	@GetMapping("/clientes")
	
	public List<Cliente>listar(){
		return clienteRepository.findAll();
	}	
	
	//Aqui eu posso consultar um cliente específico por Id
	@GetMapping("/clientes/{id}")
	public Cliente getClientebyId(@PathVariable Long id) {
		return clienteRepository.findById(id).get();
	}
	
	//cadastramento de clientes
	@PostMapping("/registrar")	
	@ResponseStatus(HttpStatus.CREATED)
	
	public Cliente registrar(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@PutMapping("/atualizar")
	
	public Cliente atualizar(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	// Deletar cliente específico por id
	@DeleteMapping("/clientes/{id}")
	
	public void deletarCliente(@PathVariable Long id) {
		clienteRepository.deleteById(id);
	}
	
}
