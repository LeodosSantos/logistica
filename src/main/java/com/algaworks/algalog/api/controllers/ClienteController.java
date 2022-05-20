package com.algaworks.algalog.api.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.ClienteModel;

@RestController
public class ClienteController {
	
	@PersistenceContext
	private EntityManager manager; /*
									 * é uma interface para fazer as operações com as entidades q serão refletidas
									 * no banco de dados
									 */
	
	@GetMapping("/clientes")
	public List<ClienteModel> listar() {
		return manager.createQuery("from ClienteModel", ClienteModel.class)
				.getResultList();
		
	}
		
}
