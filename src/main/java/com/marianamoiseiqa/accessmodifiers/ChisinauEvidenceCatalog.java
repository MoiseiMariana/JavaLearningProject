package com.marianamoiseiqa.accessmodifiers;

import com.marianamoiseiqa.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person andreiBuzu = new Person(5689671109L);
        andreiBuzu.address = " Alexandru cel Bun 105 ";
        andreiBuzu.gender = " masculin ";
        System.out.println(andreiBuzu.toString());
        Person.printNumberOfPeople();

        Person mihaiEminescu = new Person(347657889L, "Mihai Eminescu", false, 37);
        mihaiEminescu.address = "Veronica Micle 24";
        mihaiEminescu.gender = "masculin";
        System.out.println(mihaiEminescu.toString());
        Person.printNumberOfPeople();

        Person vasileBuhnici = new Person(3478977889L, "Vasile Buhnici", false, 37);
        vasileBuhnici.gender = " masculin ";
        vasileBuhnici.address = " Strada Avram Iancu 27";
        System.out.println(vasileBuhnici.toString());
        Person.printNumberOfPeople();

        Person elenaProfir = new Person(34789688889L, "Elena Profir", false, 37);
        elenaProfir.gender = " feminin ";
        elenaProfir.address = " Mitropolitul Gavril Banulescu Bodoni ";
        System.out.println(elenaProfir.toString());
        Person.printNumberOfPeople();
    }

}
