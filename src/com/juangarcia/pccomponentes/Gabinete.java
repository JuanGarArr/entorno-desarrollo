package com.juangarcia.pccomponentes;

/** Clase Gabinete
 *
 */
public class Gabinete {
    /**
     * Atributos, propiedades y variables
     */
    private Integer id;
    private String marca;
    private String size;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
