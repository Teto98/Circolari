package com.circolari.demo.service;

import java.util.Optional;

import org.springframework.web.bind.annotation.RequestBody;

import com.circolari.demo.model.Circolare;

public interface ICircolareService {
	
	public Iterable<Circolare> getAll();
	
	public Optional<Circolare> getById(int id);

	public Circolare create(Circolare circolare);
	
	public Optional<Circolare> update(int id, @RequestBody Circolare circolare);
	
	public Boolean delete(int id);

}
