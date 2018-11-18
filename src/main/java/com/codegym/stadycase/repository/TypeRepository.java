package com.codegym.stadycase.repository;

import com.codegym.stadycase.model.TypeNote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TypeRepository  extends CrudRepository<TypeNote,Integer> {
}
