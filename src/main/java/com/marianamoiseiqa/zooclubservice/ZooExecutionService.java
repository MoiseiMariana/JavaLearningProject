package com.marianamoiseiqa.zooclubservice;

public class ZooExecutionService {
    public static void main(String[] args) {
        Animal charlieDog = new Dog("Charlie");
        System.out.println("Numele obiectului charlieDog este : " + charlieDog.getName());
        charlieDog.setName("Charlie Vaccined");
        System.out.println("Numele actualizat al obiectului charlieDog este : " + charlieDog.getName());
        charlieDog.eat();
        charlieDog.makeSound();

        AnimalInterface rexDog = new Dog("Rex");
        rexDog.makeSound();

        Dog baghiraDog = new Dog("Baghira King");
        baghiraDog.eat();
        baghiraDog.makeSound();

        Cat milindaPisicuta = new Cat("Milinda");
        milindaPisicuta.makeSound();
        milindaPisicuta.eat();
        System.out.println("Milinda manaca bine ca sa faca lapte pentru pisoiasi");

        Rabbit gogoasaIepurasPreferat = new Rabbit("Gogoasa");
        gogoasaIepurasPreferat.makeSound();
        gogoasaIepurasPreferat.eat();

        Fox aleVulpeSireata = new Fox("Ale");
        aleVulpeSireata.eat();
        aleVulpeSireata.makeSound();

    }
}
