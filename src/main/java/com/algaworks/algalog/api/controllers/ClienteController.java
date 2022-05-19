package com.algaworks.algalog.api.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.ClienteModel;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<ClienteModel> listar() {
		var cliente1 = new ClienteModel();
		cliente1.setId(1L);
		cliente1.setNome("João da silva");
		cliente1.setTelefone("21 22323333");
		cliente1.setEmail("jsilva@teste.com");
		
		var cliente2 = new ClienteModel();
		cliente2.setId(1L);
		cliente2.setNome("Maria da silva");
		cliente2.setTelefone("21 922225555");
		cliente2.setEmail("Msilva@teste.com");
		
		return Arrays.asList(cliente1, cliente2);
	}
}
