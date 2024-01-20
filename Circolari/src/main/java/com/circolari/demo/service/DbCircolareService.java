package com.circolari.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.circolari.demo.model.Circolare;
import com.circolari.demo.repository.ICircolareRepository;

@Service("mainCircolareService")
public class DbCircolareService implements ICircolareService {
	
	@Autowired
	private ICircolareRepository circolareRepository;
	
	@Override
	public Iterable<Circolare> getAll(){ //Stampa le circolari
		
		return circolareRepository.findAll();
	}
	
	@Override
	public Optional<Circolare> getById(int id) {
		
		return circolareRepository.findById(id);
	}

	@Override
	public Circolare create(Circolare circolare) {

		return circolareRepository.save(circolare);
	}
	
	@Override
	public Optional<Circolare> update(int id, @RequestBody Circolare circolare) {

		Optional<Circolare> trovaCircolare = circolareRepository.findById(id);
		
		if(trovaCircolare.isEmpty()) {
			return Optional.empty();
		}
		
		trovaCircolare.get().setTitolo(circolare.getTitolo());
		trovaCircolare.get().setDescrizione(circolare.getDescrizione());
		trovaCircolare.get().setData(circolare.getData());
		
		circolareRepository.save(trovaCircolare.get());
		
		return trovaCircolare;
	}
	
	@Override
	public Boolean delete(int id) {

		Optional<Circolare> trovaCircolare = circolareRepository.findById(id);
		
		if(trovaCircolare.isEmpty()) {
			return false;
		}
		
		circolareRepository.delete(trovaCircolare.get());
		
		return true;

	}

}
