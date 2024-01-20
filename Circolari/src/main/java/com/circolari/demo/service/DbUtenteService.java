package com.circolari.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.circolari.demo.model.Utente;
import com.circolari.demo.repository.IUtenteRepository;

@Service("mainUtenteService")
public class DbUtenteService implements IUtenteService {
	
	@Autowired
	private IUtenteRepository utenteRepository;
	
	@Override
	public Iterable<Utente> getAll(){ //Stampa le circolari
		
		return utenteRepository.findAll();
	}
	
	@Override
	public Optional<Utente> getById(int id) {
		
		return utenteRepository.findById(id);
	}

	@Override
	public Utente create(Utente utente) {

		return utenteRepository.save(utente);
	}
	
	@Override
	public Optional<Utente> update(int id, @RequestBody Utente utente) {

		Optional<Utente> trovaUtente = utenteRepository.findById(id);
		
		if(trovaUtente.isEmpty()) {
			return Optional.empty();
		}
		
		trovaUtente.get().setNome(utente.getNome());
		trovaUtente.get().setCognome(utente.getCognome());
		trovaUtente.get().setEmail(utente.getEmail());
		trovaUtente.get().setPassword(utente.getPassword());
		trovaUtente.get().setTipo(utente.getTipo());
		
		utenteRepository.save(trovaUtente.get());
		
		return trovaUtente;
	}
	
	@Override
	public Boolean delete(int id) {

		Optional<Utente> trovaUtente = utenteRepository.findById(id);
		
		if(trovaUtente.isEmpty()) {
			return false;
		}
		
		utenteRepository.delete(trovaUtente.get());
		
		return true;

	}


}
