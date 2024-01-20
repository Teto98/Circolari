package com.circolari.demo.controller.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.circolari.demo.model.Utente;
import com.circolari.demo.service.IUtenteService;

@RestController
public class UtenteController {
	
	@Autowired
	@Qualifier("mainUtenteService")
	private IUtenteService utenteService;
	
	public UtenteController() {}
	
	@RequestMapping("/api/utente")
	public Iterable<Utente> getAll(){ //Stampa le circolari
		
		return utenteService.getAll();
	}
	
	@RequestMapping("/api/utente/{id}")
	public Utente getById(@PathVariable int id) {
		
		Optional<Utente> utente = utenteService.getById(id);
		
		if (utente.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
		}
		
		return utente.get();
	}

}
