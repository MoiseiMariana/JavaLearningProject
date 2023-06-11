package com.marianamoiseiqa.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Arta negocierii", "Chris Voss");
        Book book2 = new Book("Atomic Habits", "James Clear");
        Book book3 = new Book("Diary of a Wimpy Kid", "Jeff Kinney");
//      Cream obiect de tip Library
        Library library1 = new Library("Librarius");
        library1.addBook(book1);
        library1.addBook(book2);
//        System.out.println("The total amount of books in this library is: " + library1.returnNumberOfBooks());
//        library1.deleteBookFromList(2);
//        System.out.println("The total amount of books in this library is: " + library1.returnNumberOfBooks());
//        library1.deleteBookFromList(1);
//        System.out.println("The total amount of books in this library is: " + library1.returnNumberOfBooks());
        System.out.println();
//        Prin intermediul metodelor de instanta adaugam carti
        library1.addBook(book1);
        System.out.println("The total amount of books in this library is: " + library1.returnNumberOfBooks());
        library1.removeBook(book3);
        System.out.println("The total amount of books in this library is: " + library1.returnNumberOfBooks());

        System.out.println();
//        Afisam daca biblioteca contine cartea indicata
        library1.containsTheBook(book3);
        library1.containsTheBook(book1);

        System.out.println();
//        Afisam toate cartile din biblioteca
        library1.printAllTheBooks();

        System.out.println();
        Library library2 = new Library("Carturesti");
        library2.addBook(book3);
        library2.addBook(book2);
        System.out.println("The Carturesti library has: " + library2.returnNumberOfBooks() + " books.");
        System.out.println();

//        Printam in consola toate detaliile despre carti folosind metode din Map
        Map<String, Library> librariesNetwork = new HashMap<>();
        librariesNetwork.put("str. Dumitru Matcovschi 13", library1);
        librariesNetwork.put("str. Puskin 3", library2);
        librariesNetwork.get("str. Puskin 3").addBook(book3);
        librariesNetwork.get("str. Puskin 3").printAllTheBooks();
        System.out.println();
        librariesNetwork.get("str. Dumitru Matcovschi 13").printAllTheBooks();
        System.out.println();

//        Adaugam lista librariei nr 2 la lista librariei nr 1
        librariesNetwork.get("str. Dumitru Matcovschi 13").addAnotherListOfBooksIntoTheLibraryList(library2.getBookList());
        librariesNetwork.get("str. Dumitru Matcovschi 13").printAllTheBooks();
        System.out.println();

//        Determinam valoarea minima dintr-un array si o printam in consola
        int[] tablouDeDateInt = {8, 4, 7, 1, 2, 9, 40, 5, 8, 0, 11};
        System.out.println("Min value for this array is: " + IntNumberArrayService.getTheMinValueOfTheArray(tablouDeDateInt));
        System.out.println("The index of Min value for this array is: " + IntNumberArrayService.getTheMinValueIndexOfTheArray(tablouDeDateInt));
//    Determinam media aritmetica a valorilor din array
        System.out.println("The arithmetic average of this array is: " + IntNumberArrayService.getTheArithmeticAverageOfTheElements(tablouDeDateInt));
//    Sarcina optionala
        int a = 5;
        int b = 8;
        System.out.println("Prima oara obtinem a = " + a + " si b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("A doua oara obtinem a = " + a + " si b = " + b);
    }
}
