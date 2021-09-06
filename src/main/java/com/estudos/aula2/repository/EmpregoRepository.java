package com.estudos.aula2.repository;

import com.estudos.aula2.model.Emprego;

import org.springframework.data.repository.CrudRepository;

public interface EmpregoRepository extends CrudRepository<Emprego, Long>{
    
}
