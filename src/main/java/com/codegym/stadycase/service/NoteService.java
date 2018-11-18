package com.codegym.stadycase.service;

import com.codegym.stadycase.model.Note;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface NoteService {
    Iterable<Note>findAll();
    Page<Note>findAll(Pageable pageable);
    void save(Note note);
    void add(Note note);
    void delete(int id);
    Note findById(int id);
}
