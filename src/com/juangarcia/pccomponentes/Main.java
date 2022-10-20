package com.juangarcia.pccomponentes;

public class Main {
    public static void main(String[] args) {
        System.out.println("-PCCOM-");

        //Procesador
        Procesador intel = new Procesador();
        intel.setId(1);
        intel.setMarca("i7.9700k");
        intel.setFabricante("Intel");

        System.out.println(intel.getId());
        System.out.println(intel.getMarca());
        System.out.println(intel.getFabricante());

        //PlacaMadre
         PlacaMadre asus = new PlacaMadre();
        asus.setId(1);
        asus.setMarca("----");
        asus.setChipset("----");
        asus.setModelo("----");

        System.out.println(asus.getId());
        System.out.println(asus.getMarca());
        System.out.println(asus.getChipset());
        System.out.println(asus.getModelo());

        //DiscoDuro
        DiscoDuro barracuda = new DiscoDuro();
        barracuda.setId(1);
        barracuda.setMarca("----");
        barracuda.setCapacidad("----");
        barracuda.setModelo("----");

        System.out.println(barracuda.getId());
        System.out.println(barracuda.getMarca());
        System.out.println(barracuda.getCapacidad());
        System.out.println(barracuda.getModelo());

        //MemoriaRAM
        MemoriaRAM Corsair = new MemoriaRAM();
        Corsair.setId(1);
        Corsair.setMarca("----");
        Corsair.setVelocidad("----");
        Corsair.setModelo("----");

        System.out.println(Corsair.getId());
        System.out.println(Corsair.getMarca());
        System.out.println(Corsair.getVelocidad());
        System.out.println(Corsair.getModelo());

        //TarjetaGrafica
        GraficCard rtx = new GraficCard();
        rtx.setId(1);
        rtx.setMarca("----");
        rtx.setMemoriaDDRAM("----");
        rtx.setModelo("----");

        System.out.println(rtx.getId());
        System.out.println(rtx.getMarca());
        System.out.println(rtx.getMemoriaDDRAM());
        System.out.println(rtx.getModelo());

        //Gabinete
        Gabinete noxhumer = new Gabinete();
        noxhumer.setId(1);
        noxhumer.setMarca("----");
        noxhumer.setSize("----");
        noxhumer.setModelo("----");

        System.out.println(noxhumer.getId());
        System.out.println(noxhumer.getMarca());
        System.out.println(noxhumer.getSize());
        System.out.println(noxhumer.getModelo());

        //FuenteAlimentacion
        FuenteAlimentacion coolermaster = new FuenteAlimentacion();
        coolermaster.setId(1);
        coolermaster.setMarca("----");
        coolermaster.setPotencia("----");
        coolermaster.setModelo("----");

        System.out.println(coolermaster.getId());
        System.out.println(coolermaster.getMarca());
        System.out.println(coolermaster.getPotencia());
        System.out.println(coolermaster.getModelo());
}
}
