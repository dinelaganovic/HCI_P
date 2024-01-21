package com.example.backend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "kucica")
public class Kucica {
    @Id
    @Column(name = "kucica_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    @Column(name = "dimension", length = 255)
    private  int dimension;
    @Column(name = "color", length = 255)
    private  String color;
    @Column(name = "size", length = 255)
    private  int size;

    public Kucica() {
    }

    public Kucica(Long id, int dimension, String color, int size) {
        this.id = id;
        this.dimension = dimension;
        this.color = color;
        this.size = size;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Long getId() {
        return id;
    }

    public int getDimension() {
        return dimension;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "KucicaDTO{" +
                "id=" + id +
                ", dimension=" + dimension +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
