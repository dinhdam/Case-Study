package com.codegym.stadycase.model;

import com.codegym.stadycase.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;
@Component
public class NoteFormatter implements Formatter<Note> {
    private NoteService noteService;
    @Autowired
    public NoteFormatter(NoteService noteService){
        this.noteService = noteService;
    }
    @Override
    public Note parse(String text, Locale locale) throws ParseException {
        return  noteService.findById(Integer.parseInt(text));
    }

    @Override
    public String print(Note object, Locale locale) {
        return null;
    }
}
