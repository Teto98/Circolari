/*
package com.circolari.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import com.circolari.demo.model.Circolare;

@Service
public class CircolareService implements ICircolareService {
	
	private List<Circolare> list;
	
	private int lastId;
	
	public CircolareService() {
		list = new ArrayList<Circolare>();
		list.add(new Circolare(1,"Prova","provetta","5 maggio"));
		list.add(new Circolare(2,"Prova2","provetta","5 maggio"));
		
		lastId = 2;
	}
	
	@Override
	public Iterable<Circolare> getAll(){ //Stampa le circolari
		
		return list;
	}
	
	@Override
	public Optional<Circolare> getById(int id) {
		
		Optional<Circolare> circolare = list.stream().filter(item->item.getId() == id).findFirst();
		
		return circolare;
	}

	@Override
	public Circolare create(Circolare circolare) {
		lastId++;
		circolare.setId(lastId);
		list.add(circolare);
		return circolare;
	}
	
	@Override
	public Optional<Circolare> update(int id, @RequestBody Circolare circolare) {
		Optional<Circolare> trovaCircolare = list.stream().filter(item->item.getId() == id).findFirst();
		
		if (trovaCircolare.isEmpty()) {
			return Optional.empty();
		}
		
		trovaCircolare.get().setTitolo(circolare.getTitolo());
		trovaCircolare.get().setDescrizione(circolare.getDescrizione());
		trovaCircolare.get().setData(circolare.getData());
		
		
		return trovaCircolare;
	}
	
	@Override
	public Boolean delete(int id) {
		Optional<Circolare> trovaCircolare = list.stream().filter(item->item.getId() == id).findFirst();
		
		if (trovaCircolare.isEmpty()) {
			return false;
		}
		
		list.remove(trovaCircolare.get());
		
		return true;
	}
}
*/