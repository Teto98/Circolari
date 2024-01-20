package com.circolari.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.circolari.demo.model.Circolare;

@Repository
public interface ICircolareRepository extends CrudRepository<Circolare, Integer>{

}
