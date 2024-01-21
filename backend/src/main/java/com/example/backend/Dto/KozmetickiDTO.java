package com.example.backend.Dto;

public class KozmetickiDTO {
    private  Long id;
    private  int cena;
    private  String naziv;
    private  String detalji;

    public KozmetickiDTO() {
    }

    public KozmetickiDTO(Long id, int cena, String naziv, String detalji) {
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
