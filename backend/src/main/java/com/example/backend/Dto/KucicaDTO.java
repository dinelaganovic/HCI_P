package com.example.backend.Dto;

public class KucicaDTO {
    private  Long id;
    private  int dimension;
    private  String color;
    private  int size;

    public KucicaDTO() {
    }

    public KucicaDTO(Long id, int dimension, String color, int size) {
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
