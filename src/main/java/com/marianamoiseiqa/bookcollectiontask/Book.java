package com.marianamoiseiqa.bookcollectiontask;

public class Book {
    //    Definirea a doua proprietati private
    private String title;
    private String author;

    //    Initierea valorilor prin intermediul constructorilor cu parametri (in loc de setter)
    public Book(String inputTitle, String inputAuthor) {
        this.title = inputTitle;
        this.author = inputAuthor;

    }

    //    Definim doua metode de instanta de tip getter pentru a putea citi proprietatile
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }
}
