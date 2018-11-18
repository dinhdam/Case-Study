package com.codegym.stadycase.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "typenote")
public class TypeNote {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @OneToMany(targetEntity = Note.class)
    private List<Note>notes;
  public TypeNote(){

  }
  public TypeNote(String name,String description){
      this.name= name;
      this.description= description;

  }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }
}
