package com.circolari.demo.controller.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.circolari.demo.model.Circolare;
import com.circolari.demo.service.ICircolareService;

@RestController
public class CircolareController {
	
	@Autowired
	@Qualifier("mainCircolareService")
	private ICircolareService circolareService;
	
	public CircolareController() {}
	
	@RequestMapping("/api/circolare")
	public Iterable<Circolare> getAll(){ //Stampa le circolari
		
		return circolareService.getAll();
	}
	
	@RequestMapping("/api/circolare/{id}")
	public Circolare getById(@PathVariable int id) {
		
		Optional<Circolare> circolare = circolareService.getById(id);
		
		if (circolare.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
		}
		
		return circolare.get();
	}

}
