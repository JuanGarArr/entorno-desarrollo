package com.juangarcia.pccomponentes;

/** Clase Tarjeta de Sonido
        *
        */
public class TarjetaSonido {
    /**
     * Atributos, propiedades y variables
     */
    private Integer id;
    private String marca;
    private String puerto;
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

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
