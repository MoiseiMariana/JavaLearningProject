package com.marianamoiseiqa.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {
        Garage garajulLuiAndrei = new Garage("Cuza Voda");
        System.out.println("The address of Andrei's garage is " + garajulLuiAndrei.address);
        garajulLuiAndrei.carCapacity = 280;
        garajulLuiAndrei.hasComputerDiagnostics = true;
        garajulLuiAndrei.numberID = "678";
        garajulLuiAndrei.schedule = "Mon-Fri";

        System.out.println("The Andrei's garage has this proprieties: Address " + garajulLuiAndrei.address +
                " CarCapacity: " + garajulLuiAndrei.carCapacity
                + " ComputerDiagnostic: " + garajulLuiAndrei.hasComputerDiagnostics
                + " NumberID: " + garajulLuiAndrei.numberID +
                " schedule " + garajulLuiAndrei.schedule);

        Garage garajulLuiGheorg = new Garage("Traian");
        System.out.println(" The address of Gheorghe's garage is " + garajulLuiGheorg.address);
        garajulLuiGheorg.carCapacity = 270;
        garajulLuiGheorg.hasComputerDiagnostics = true;
        garajulLuiGheorg.numberID = "501";
        garajulLuiGheorg.schedule = "Mon-Sun";

        System.out.println("The Gheorghe's garage has this proprieties: Address " + garajulLuiGheorg.address
                + " CarCapacity: " + garajulLuiGheorg.carCapacity
                + " ComputerDiagnostic: " + garajulLuiGheorg.hasComputerDiagnostics
                + " NumberID:" + garajulLuiGheorg.numberID
                + " schedule " + garajulLuiGheorg.schedule);

        Garage garajulElenei = new Garage(220);
        System.out.println(" The address of Elena's garage is " + garajulElenei.address);
        System.out.println("Elena's garage has capacity of " + garajulElenei.carCapacity);
        garajulElenei.address = "Bulevardul Renasterii";
        garajulElenei.hasComputerDiagnostics = true;
        garajulElenei.numberID = "603";
        garajulElenei.schedule = "Mon-Fri";

        System.out.println("The Elena's garage has this proprieties: Address " + garajulElenei.address
                + " CarCapacity: " + garajulElenei.carCapacity
                + " ComputerDiagnostic: " + garajulElenei.hasComputerDiagnostics
                + " NumberID: " + garajulElenei.numberID
                + " schedule " + garajulElenei.schedule);

        Car masinaLuiDumitru = new Car("BMW", 2017);
        System.out.println("Dumitru is a cool boy because has " + masinaLuiDumitru.modelCar + masinaLuiDumitru.yearOfManufacture);
        masinaLuiDumitru.gearType = "manual";
        masinaLuiDumitru.hasSafetySystem = true;
        masinaLuiDumitru.numberOfDoors = 4;
        masinaLuiDumitru.seatingCapacity = 7;
        System.out.println("The Dumitru's car has all these caracteristics: Model " + masinaLuiDumitru.modelCar
                + " YearOfManufacture " + masinaLuiDumitru.yearOfManufacture
                + " GearType " + masinaLuiDumitru.gearType
                + " SafetySystem " + masinaLuiDumitru.hasSafetySystem
                + " NumberOfDoors " + masinaLuiDumitru.numberOfDoors
                + " SeatingCapacity " + masinaLuiDumitru.seatingCapacity);

        Tool blackTool = new Tool(97);
        System.out.println(" A very usefull tool was introducted that has code " + blackTool.uniqueCode);
        blackTool.isUsed = true;
        blackTool.needsElectricity = true;
        System.out.println(" A very usefull tool was introducted that has all these specifications: UniqueCode " + blackTool.uniqueCode
                + " Used " + blackTool.isUsed
                + " NeedsElectricity " + blackTool.needsElectricity);

        Worker lucratorulMary = new Worker(17, "painter");
        System.out.println("Mary is the new worker and as a specialist is " + lucratorulMary.specialization
                + " and she is " + lucratorulMary.age + "years old");
        lucratorulMary.isExperienced = false;
        lucratorulMary.name = "Marianna";

        System.out.println("We would like to introduce the new worker that has name : " + lucratorulMary.name
                + " WorkExperienceInPainting " + lucratorulMary.isExperienced
                + " Age " + lucratorulMary.age
                + " Specialization " + lucratorulMary.specialization);


    }
}
