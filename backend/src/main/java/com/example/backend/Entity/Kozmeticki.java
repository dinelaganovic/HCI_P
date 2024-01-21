package com.example.backend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "kozmeticki")
public class Kozmeticki {
    @Id
    @Column(name = "kucica_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    @Column(name = "cena", length = 255)

    private  int cena;
    @Column(name = "naziv", length = 255)

    private  String naziv;
    @Column(name = "detalji", length = 255)

    private  String detalji;

    public Kozmeticki() {
    }

    public Kozmeticki(Long id, int cena, String naziv, String detalji) {
        this.id = id;
        this.cena = cena;
        this.naziv = naziv;
        this.detalji = detalji;
    }

    public Long getId() {
        return id;
    }

    public int getCena() {
        return cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getDetalji() {
        return detalji;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setDetalji(String detalji) {
        this.detalji = detalji;
    }

    @Override
    public String toString() {
        return "Kozmeticki{" +
                "id=" + id +
                ", cena=" + cena +
                ", naziv='" + naziv + '\'' +
                ", detalji='" + detalji + '\'' +
                '}';
    }
}

