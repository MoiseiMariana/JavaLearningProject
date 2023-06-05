package com.marianamoiseiqa.filemanagementservice;
import java.io.File;
import java.io.IOException;

public class FileManager {
    // metoda statica ce creaza obiect File
    public static void createTheFileIfItDoesNotExist(File inputFile) {
        if (inputFile.exists()) {
            System.out.println("The file already exists.");
        } else {
            System.out.println("The file does not exist, it has to be create.");
            try {
                inputFile.createNewFile();
            } catch (IOException e) {
                System.out.println("There is an exception: " + e.getMessage());
            }
        }
    }

    // metoda statica ce verifica daca fisierul exista
    public static void informIfTheFileExists(File file) {
        if (file.exists()) {
            System.out.println("The file exists.");
        } else System.out.println("The file does not exist.");
    }

    // metoda statica ce printeaza numele fisierului
    public static void printTheFileName(File file) {
        System.out.println("The file name is: " + file.getName());
    }

    // metoda statica ce returneaza calea absoluta
    public static void prinTheAbsolutePath(File file) {
        System.out.println("The file absolute path: " + file.getAbsolutePath());
    }

    // metoda statica ce verifica daca "files" este un directoriu
    public static void printIfTheFilesIsADirectory(File inputFile) {
        System.out.println("The file is a directory: " + inputFile.isDirectory());

        //alternativa la metoda de mai sus
//        if (inputFile.isDirectory()) {
//            System.out.println("This is a directory");
//        } else {
//            System.out.println("This is not a directory, is a file.");
//        }
    }

    // metoda statica ce sterge fisierul
    public static void deleteTheFileIfExists(File inputFile) {
        if (inputFile.exists()) {
            if (inputFile.delete()) {
                System.out.println("The file was deleted");
            } else {
                System.out.println("The file exists, but was not deleted.");
            }
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
