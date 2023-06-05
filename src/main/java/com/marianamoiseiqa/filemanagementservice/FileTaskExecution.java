package com.marianamoiseiqa.filemanagementservice;
import java.io.File;
import java.io.IOException;

public class FileTaskExecution {
    public static void main(String[] args) {
        File file1 = new File("src/main/java/com/marianamoiseiqa/filemanagementservice/test.txt");
        FileManager.createTheFileIfItDoesNotExist(file1);
        FileManager.informIfTheFileExists(file1);
        FileManager.printTheFileName(file1);
        FileManager.printIfTheFilesIsADirectory(file1);
        FileManager.prinTheAbsolutePath(file1);
//        FileManager.deleteTheFileIfExists(file1);

        InputFileReadManager.readDataFromATextFile(file1);
        InputFileReadManager.readDataFromATextFileUsingFileReader(file1);
        System.out.println();
        InputFileReadManager.readDataFromATextFileUsingBufferedReader(file1);

        String contentForFile = "Tema zilei: citirea si scrierea datelor intr-un fisier.";
        OutputFileWriterManager.writeDataIntoFileWhitFileWrite(file1, contentForFile);
        OutputFileWriterManager.writeDataIntoFileWhitBufferedWriter(file1, "Empty");
    }
}
