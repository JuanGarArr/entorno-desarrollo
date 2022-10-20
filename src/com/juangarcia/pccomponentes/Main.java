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
    }
}