package com.circolari.demo.controller.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.circolari.demo.model.Utente;
import com.circolari.demo.service.IUtenteService;

@RestController
public class AmministratoreUtenteController {
	
	@Autowired
	@Qualifier("mainUtenteService")
	private IUtenteService utenteService;
	
	public AmministratoreUtenteController() {}
	
	@RequestMapping("/amministratore/api/utente")
	public Iterable<Utente> getAll(){ //Stampa le circolari
		
		return utenteService.getAll();
	}
	
	@RequestMapping("/amministratore/api/utente/{id}")
	public Utente getById(@PathVariable int id) {
		
		Optional<Utente> utente = utenteService.getById(id);
		
		if (utente.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
		}
		
		return utente.get();
	}
	
	@RequestMapping(value = "/amministratore/api/utente", method = RequestMethod.POST)
	public Utente create(@RequestBody Utente utente) {

		return utenteService.create(utente);
	}
	
	@RequestMapping(value = "/amministratore/api/utente/{id}", method = RequestMethod.PUT)
	public Utente update(@PathVariable int id, @RequestBody Utente utente) {
		Optional<Utente> utenteAggiornata = utenteService.update(id, utente);
		
		if (utenteAggiornata.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
		}
		
		return utenteAggiornata.get();
	}
	
	@RequestMapping(value = "/amministratore/api/utente/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
		Boolean eliminata = utenteService.delete(id);
		
		if (eliminata == false) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
		}
	}


}
