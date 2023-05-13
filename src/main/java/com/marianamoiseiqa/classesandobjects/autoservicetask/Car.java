package com.marianamoiseiqa.classesandobjects.autoservicetask;

public class Car {
    //Defining all proprieties of car
    String modelCar;
    int yearOfManufacture;
    int numberOfDoors;
    String gearType;
    int seatingCapacity;
    boolean hasSafetySystem;

    //Creating first constructor
    public Car(String modelCar, int yearOfManufacture) {
        this.modelCar = modelCar;
        this.yearOfManufacture = yearOfManufacture;
        //System.out.println("After executing this constructor with 2 parameters, a new object is created about that is not known numberOfDoors, seatingCapacity, hasSafetySystem and gearType" );
    }

    public Car(String modelCar, String gearType) {
        this.modelCar = modelCar;
        this.gearType = gearType;
        //System.out.println("A car has been created, of which  only the modelCAr and gearType is known");
    }
}
