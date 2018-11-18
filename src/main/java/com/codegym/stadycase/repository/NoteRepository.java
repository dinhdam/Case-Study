package com.codegym.stadycase.repository;

import com.codegym.stadycase.model.Note;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends PagingAndSortingRepository<Note,Integer> {

}
