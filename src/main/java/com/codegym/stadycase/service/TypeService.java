package com.codegym.stadycase.service;


import com.codegym.stadycase.model.TypeNote;
public interface TypeService {
    Iterable<TypeNote>findAll();
    void save(TypeNote typeNote);
    void delete(int id);
    void add(TypeNote typeNote);
    TypeNote findById(int id);

}
