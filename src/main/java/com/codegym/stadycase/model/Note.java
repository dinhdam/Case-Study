package com.codegym.stadycase.model;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name = "note")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    @ManyToOne
    @JoinColumn(name="idtype")
    private TypeNote type ;
    @Column(name="title")
    private String title;
    @Column(name = "content")
    private String content;

    public Note(){

    }
    public Note(String title,String content,TypeNote type){
        this.content= content;
        this.title= title;
        this.type =type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypeNote getType() {
        return type;
    }

    public void setType(TypeNote type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
