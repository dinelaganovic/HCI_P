package com.example.backend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "predmet")
public class Predmet {

    @Id
    @Column(name = "predmet_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    @Column(name = "name", length = 255)
    private  String name;
    @Column(name = "ocena", length = 255)
    private  int ocena;

    public Predmet() {
    }

    public Predmet(Long id, String name, int ocena) {
        this.id = id;
        this.name = name;
        this.ocena = ocena;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getOcena() {
        return ocena;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    @Override
    public String toString() {
        return "Predmet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ocena=" + ocena +
                '}';
    }
}
