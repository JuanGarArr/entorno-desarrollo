package com.juangarcia.pccomponentes;

import java.util.ArrayList;
import java.util.List;

public class SetuPc {
    private String id;
    private Procesador procesador;
    private PlacaMadre placaMadre;
    private Altavoces altavoces;
    private DiscoDuro discoDuro;
    private FuenteAlimentacion fuenteAlimentacion;
    private Gabinete gabinete;
    private GrabadoraDVD grabadoraDVD;
    private GraficCard graficCard;
    private MemoriaRAM memoriaRAM;
    private Monitor monitor;
    private Raton raton;
    private TarjetaSonido tarjetaSonido;
    private Teclado teclado;
    private VentiladorCpu ventiladorCpu;

    private List<MemoriaRAM>memoriaRAMList;

    public void setId(String id) {
        this.id = id;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public void setPlacaMadre(PlacaMadre placaMadre) {
        this.placaMadre = placaMadre;
    }

    public void setAltavoces(Altavoces altavoces) {
        this.altavoces = altavoces;
    }

    public void setDiscoDuro(DiscoDuro discoDuro) {
        this.discoDuro = discoDuro;
    }

    public void setGabinete(Gabinete gabinete) {
        this.gabinete = gabinete;
    }

    public void setFuenteAlimentacion(FuenteAlimentacion fuenteAlimentacion) {
        this.fuenteAlimentacion = fuenteAlimentacion;
    }

    public void setGrabadoraDVD(GrabadoraDVD grabadoraDVD) {
        this.grabadoraDVD = grabadoraDVD;
    }

    public void setGraficCard(GraficCard graficCard) {
        this.graficCard = graficCard;
    }

    public void setMemoriaRAM(MemoriaRAM memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public void setTarjetaSonido(TarjetaSonido tarjetaSonido) {
        this.tarjetaSonido = tarjetaSonido;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public void setVentiladorCpu(VentiladorCpu ventiladorCpu) {
        this.ventiladorCpu = ventiladorCpu;
    }

    public void setMemoriaRAMList(List<MemoriaRAM> memoriaRAMList) {
        this.memoriaRAMList = memoriaRAMList;
    }

    public String getId() {
        return id;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public DiscoDuro getDiscoDuro() {
        return discoDuro;
    }

    public Altavoces getAltavoces() {
        return altavoces;
    }

    public FuenteAlimentacion getFuenteAlimentacion() {
        return fuenteAlimentacion;
    }

    public Gabinete getGabinete() {
        return gabinete;
    }

    public GrabadoraDVD getGrabadoraDVD() {
        return grabadoraDVD;
    }

    public GraficCard getGraficCard() {
        return graficCard;
    }

    public MemoriaRAM getMemoriaRAM() {
        return memoriaRAM;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Raton getRaton() {
        return raton;
    }

    public TarjetaSonido getTarjetaSonido() {
        return tarjetaSonido;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public VentiladorCpu getVentiladorCpu() {
        return ventiladorCpu;
    }

    public List<MemoriaRAM> getMemoriaRAMList() {
        return memoriaRAMList;
    }
}
