package com.marianamoiseiqa.exceptionsservicetask;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//     Exceptie neverificata de tipul ArithmeticOperationService cand b = 0
//      int result1 = ArithmeticOperationService.divideIntNoExceptionHandling(28, 0);
//      System.out.println(result1);
        int result2 = ArithmeticOperationService.divideIntWithExceptionHandling(8, 0);
        System.out.println(result2);
        System.out.println("The programe is running till the end.");
        System.out.println();
//        Exceptie neverificata de tipul NullPointerException
        String stringValue1 = "Mariana";
        System.out.println(TextManager.getTheTextLengthWithNoTryAndCatch(stringValue1));
        String stringValue2 = null;
//        System.out.println(TextManager.getTheTextLengthWithNoTryAndCatch(stringValue2));
        System.out.println(TextManager.getTheTextLengthWithTryAndCatchFinally(stringValue2));
        System.out.println(TextManager.getTheTextLengthIfElse(stringValue2));
        System.out.println();

        String filePath = "src/main/java/com/marianamoiseiqa/exceptionsservicetask/test.txt";
        try {
            ReadDataManager.readDataFromFileWithoutTryAndCatch(filePath);
        } catch (IOException exceptionObject) {
            System.out.println("The file does not exist, but the execution of the programme is not interrupted ");
        }
        System.out.println("The programme is running");

        ReadDataManager.readDataFromFileWitTryAndCatch(filePath);
    }
}
