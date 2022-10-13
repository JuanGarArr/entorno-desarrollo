package com.juangarcia.pccomponentes;

/** Clase Placa Base
 *
 */
public class PlacaMadre {
    /**
     * Atributos, propiedades y variables
     */
    private Integer id;
    private String marca;
    private String chipset;
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

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
