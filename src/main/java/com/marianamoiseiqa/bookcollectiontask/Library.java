package com.marianamoiseiqa.bookcollectiontask;

import java.util.ArrayList;
import java.util.List;

public class Library {
    //    Declaram doua proprietati private una de tip List<Book> si alta String
    private List<Book> bookList;
    private String name;

    //    Initiem proprietatile prin intermediul constructorilor
    public Library(String inputName) {
        this.name = inputName;
        bookList = new ArrayList<>();
    }

    //    Definim metodele de instanta
    public void addBook(Book inputBook) {
        bookList.add(inputBook); // adaugam carti in librarie
    }

    public int returnNumberOfBooks() {
        return bookList.size(); //return nr total de carti
    }

//    public void deleteBookFromList(int elementPozition) {
//        try {
//            Book deletedBook = bookList.remove(elementPozition); // stergem cartea in baza indexului
//            System.out.println("The following book was deleted: " + deletedBook.getTitle());
//        } catch (IndexOutOfBoundsException exceptionObject) {
//            System.out.println("Please review the index, the indicated one is out of bounds: " +exceptionObject.getMessage());
//        }

    public void removeBook(Book removeBook) {
        boolean isDeleted = bookList.remove(removeBook); // stergem o carte din lista, cu conditia if
        if (isDeleted) {
            System.out.println("The following book was removed from the list of library: " + removeBook.getTitle());
        } else {
            System.out.println("This book: " + removeBook.getTitle() + " does not exists in the library.");
        }
    }

    public void containsTheBook(Book containsTheBook) {
        boolean containsBook = bookList.contains(containsTheBook); //verificam daca cartea exista in stoc
        if (containsBook) {
            System.out.println("Tbe library contains the following book: " + containsTheBook.getTitle());
        } else {
            System.out.println("The library does not containt the following book: " + containsTheBook.getTitle());
        }
    }

    public void printAllTheBooks() {
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("The book number " + i + " is: " + bookList.get(i).getTitle() + " by " + bookList.get(i).getAuthor());
        }
    }

    public void addAnotherListOfBooksIntoTheLibraryList(List<Book> anotherListOfBooks) {
        this.bookList.addAll(anotherListOfBooks);
    }

    public List<Book> getBookList() {
        return this.bookList;
    }
}
