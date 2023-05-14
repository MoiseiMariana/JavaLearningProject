package com.marianamoiseiqa.classesandobjects.autoservicetask;

public class Garage {
    //Defining all proprieties of garage
    String address;
    boolean hasComputerDiagnostics;
    int carCapacity;
    String numberID;
    String schedule;

    public Garage(String adresaInitiala) {
        this.address = adresaInitiala;
        //System.out.println("There was created a new garage");
    }

    public Garage(int carCapacity) {
        this.carCapacity = carCapacity;
    }

}
