package com.marianamoiseiqa.filemanagementservice;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class InputFileReadManager {
    //    Clasa Files pentru citirea datelor
    public static void readDataFromATextFile(File file) {
        try {
            System.out.println(Files.readString(Path.of(file.getPath())));
        } catch (IOException exceptionObject) {
            System.out.println("There is an exception: " + exceptionObject.getMessage());
        }

    }

    //    Clasa FileReader pentru citirea datelor
    public static void readDataFromATextFileUsingFileReader(File file) {
        try {
            FileReader fileReader = new FileReader(file);
            int charIntValue = 0;
            while ((charIntValue = fileReader.read()) != -1) {
                System.out.print((char) charIntValue); //castingul fortat, convertirea caracterului
            }

        } catch (IOException exceptionObject) {
            System.out.println("There is an exception: " + exceptionObject.getMessage());
        }
    }

    //    Clasa BufferedReader pentru citirea datelor
    public static void readDataFromATextFileUsingBufferedReader(File inputFile) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(inputFile));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException exceptionObject) {
            System.out.println("There is an exception: " + exceptionObject.getMessage());
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}