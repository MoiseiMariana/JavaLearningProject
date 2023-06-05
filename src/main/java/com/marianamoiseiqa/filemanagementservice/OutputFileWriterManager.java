package com.marianamoiseiqa.filemanagementservice;
import java.io.*;

public class OutputFileWriterManager {
    //     Clasa FileWrite pentru scrierea datelor
    public static void writeDataIntoFileWhitFileWrite(File file, String content) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(content);
        } catch (IOException exceptionObject) {
            System.out.println("There has been found an exception: " + exceptionObject.getMessage());
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    //    Clasa BufferedWriter pentru scrierea datelor
    public static void writeDataIntoFileWhitBufferedWriter(File file, String content) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(content);
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}