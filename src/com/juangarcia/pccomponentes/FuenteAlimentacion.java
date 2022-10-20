package com.juangarcia.pccomponentes;

/** Clase Fuente De Alimentacion
 *
 */
public class FuenteAlimentacion {
    /**
     * Atributos, propiedades y variables
     */
    private Integer id;
    private String marca;
    private String potencia;
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

    public String getPotencia() {
        return potencia;
    }

    public void setChipset(String potencia) {
        this.potencia = potencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
