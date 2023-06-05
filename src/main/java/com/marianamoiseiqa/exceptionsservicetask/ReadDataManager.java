package com.marianamoiseiqa.exceptionsservicetask;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class ReadDataManager {
    public static String readDataFromFileWithoutTryAndCatch(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath); //obiect intermediar
        BufferedReader reader = new BufferedReader(fileReader);
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        return reader.toString();
    }

    public static String readDataFromFileWitTryAndCatch(String filePath) {
        try {
            FileReader fileReader = new FileReader(filePath); //obiect intermediar
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            return reader.toString();
        } catch (IOException exception) {
            System.out.println("An error has occurred: " + exception.getMessage());
            return "";
        }
    }
}
