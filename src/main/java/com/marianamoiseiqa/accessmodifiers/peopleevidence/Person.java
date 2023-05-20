package com.marianamoiseiqa.accessmodifiers.peopleevidence;

public class Person {
    // This property is class related - Class Variable, it is private - it can be accesed only within the Person
    public static int totalNumberOfPersonObjects;
    //IDNP
    // The final key word describe a non access modifiers which means that this property will not be changed during the execution and it has to be initialized once the object is created.
    private final long CNP;
    // The gander and name are instance variables because they describe the objects of the class. Public means that they can be accessed from anywhere in the project.
    public String gender;
    public String name;
    public String address;
    // The protected property can be accessed only from classes which belongs to the peopleevidence package
    protected String phone;
    double height;
    String eyescolor;
    double weight;
    String education;
    String nationality;
    boolean isMarried;
    String readingBook;
    String emailAddress;
    String occupation;
    // This is an instance variable and it is declared as private - it  can be accessed only from Person class
    private int age;

    // There is a constructer with only one parameter that is a mandatory field
    public Person(long CNPObligatoriuLaCreare) {
        CNP = CNPObligatoriuLaCreare;
        totalNumberOfPersonObjects++;
    }

    // There is a constructer with 4 parameters that contains the mandatory CNP field too
    public Person(long CNP, String name, boolean isMarried, int age) {
        this.CNP = CNP;
        this.name = name;
        this.isMarried = isMarried;
        this.age = age;
        totalNumberOfPersonObjects += 1;
        // totalNumberOfPersonObjects = totalNumberOfPersonObjects + 1;
    }

    public static void printNumberOfPeople() {
        System.out.println("Numarul total de persoane este = " + totalNumberOfPersonObjects);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", CNP=" + CNP +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", height=" + height +
                ", eyescolor='" + eyescolor + '\'' +
                ", weight=" + weight +
                ", education='" + education + '\'' +
                ", nationality='" + nationality + '\'' +
                ", isMarried=" + isMarried +
                ", readingBook='" + readingBook + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
