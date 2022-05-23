package com.algaworks.algalog.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.ClienteModel;
import com.algaworks.algalog.domain.repository.ClienteRepository;

@RestController
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping("/clientes")
	public List<ClienteModel> listar() {
	return clienteRepository.findAll();
//		return clienteRepository.findByNome("maria silva");
//		return clienteRepository.findByNomeContaining("silva");
	}
	
	@GetMapping("/cliente/{clienteId}")
	public ResponseEntity<ClienteModel> buscaIndividual(@PathVariable Long clienteID){
		Optional<ClienteModel> cliente = clienteRepository.findById(clienteID);
		/* trantando código de erro 200 ou 404*/
		if (cliente.isPresent()) {
			return ResponseEntity.OK(cliente.get());
		}
		return ResponseEntity.notFound().build();
		
		/* parei no crud 7:29 */
		
	}
}
