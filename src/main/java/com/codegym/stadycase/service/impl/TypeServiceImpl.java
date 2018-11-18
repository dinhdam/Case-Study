package com.codegym.stadycase.service.impl;

import com.codegym.stadycase.model.TypeNote;
import com.codegym.stadycase.repository.TypeRepository;
import com.codegym.stadycase.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;

@Service

public class TypeServiceImpl implements TypeService {
    @Autowired
    TypeRepository typeRepository;

    @Override
    public Iterable<TypeNote> findAll() {
        return typeRepository.findAll();
    }

    @Override
    public void save(TypeNote typeNote) {
        typeRepository.save(typeNote);
    }

    @Override
    public void delete(int id) {
       typeRepository.deleteById(id);
    }

    @Override
    public void add(TypeNote typeNote) {
        typeRepository.save(typeNote);
    }

    @Override
    public TypeNote findById(int id) {
        return typeRepository.findById(id).orElse(null);
    }
}
