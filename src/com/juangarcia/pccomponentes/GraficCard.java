package com.juangarcia.pccomponentes;

/** Tarjeta Grafica
 *
 */
 public class GraficCard {
    /**
     * Atributos, propiedades y variables
     */
    private Integer id;
    private String marca;
    private String modelo;
    private String memoriaDDRAM;
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
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMemoriaDDRAM() {
        return memoriaDDRAM;
    }

    public void setMemoriaDDRAM(String MemoriaDDRAM) {
        this.memoriaDDRAM = MemoriaDDRAM;
    }

}
