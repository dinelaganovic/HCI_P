package com.example.backend.Dto;

public class PredmetDTO {
    private  Long id;

    private  String name;
    private  int ocena;

    public PredmetDTO() {
    }

    public PredmetDTO(Long id, String name, int ocena) {
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
