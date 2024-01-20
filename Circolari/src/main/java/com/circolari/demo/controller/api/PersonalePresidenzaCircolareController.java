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

import com.circolari.demo.model.Circolare;
import com.circolari.demo.service.ICircolareService;

@RestController
public class PersonalePresidenzaCircolareController {
	
	@Autowired
	@Qualifier("mainCircolareService")
	private ICircolareService circolareService;
	
	public PersonalePresidenzaCircolareController() {}
	
	@RequestMapping("/personale_presidenza/api/circolare")
	public Iterable<Circolare> getAll(){ //Stampa le circolari
		
		return circolareService.getAll();
	}
	
	@RequestMapping("/personale_presidenza/api/circolare/{id}")
	public Circolare getById(@PathVariable int id) {
		
		Optional<Circolare> circolare = circolareService.getById(id);
		
		if (circolare.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
		}
		
		return circolare.get();
	}
	
	@RequestMapping(value = "/personale_presidenza/api/circolare", method = RequestMethod.POST)
	public Circolare create(@RequestBody Circolare circolare) {

		return circolareService.create(circolare);
	}
	
	@RequestMapping(value = "/personale_presidenza/api/circolare/{id}", method = RequestMethod.PUT)
	public Circolare update(@PathVariable int id, @RequestBody Circolare circolare) {
		Optional<Circolare> circolareAggiornata = circolareService.update(id, circolare);
		
		if (circolareAggiornata.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
		}
		
		return circolareAggiornata.get();
	}
	
	@RequestMapping(value = "/personale_presidenza/api/circolare/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
		Boolean eliminata = circolareService.delete(id);
		
		if (eliminata == false) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
		}
	}


}
