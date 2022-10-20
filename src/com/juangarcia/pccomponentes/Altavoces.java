package com.juangarcia.pccomponentes;

/** Clase Altavoces
        *
        */
public class Altavoces {
    /**
     * Atributos, propiedades y variables
     */
    private Integer id;
    private String marca;
    private String potencia;
    private String size;
    /**
     * Metodos, funciones, comportamiento
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia){
        this.potencia = potencia;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
