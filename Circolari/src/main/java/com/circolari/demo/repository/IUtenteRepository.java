package com.circolari.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.circolari.demo.model.Utente;

@Repository
public interface IUtenteRepository extends CrudRepository<Utente, Integer>{

}
