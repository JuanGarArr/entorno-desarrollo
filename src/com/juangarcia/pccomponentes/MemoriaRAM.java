package com.juangarcia.pccomponentes;

/** Clase MemoriaRAM
 *
 */
public class MemoriaRAM {
    /**
     * Atributos, propiedades y variables
     */
    private Integer id;
    private String marca;
    private String velocidad;
    private String modelo;
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

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
