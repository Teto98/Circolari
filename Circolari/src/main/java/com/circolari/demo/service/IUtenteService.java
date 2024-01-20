package com.circolari.demo.service;

import java.util.Optional;

import org.springframework.web.bind.annotation.RequestBody;

import com.circolari.demo.model.Utente;

public interface IUtenteService {
	
	public Iterable<Utente> getAll();
	
	public Optional<Utente> getById(int id);

	public Utente create(Utente utente);
	
	public Optional<Utente> update(int id, @RequestBody Utente utente);
	
	public Boolean delete(int id);

}
