package com.marianamoiseiqa.exceptionsservicetask;

public class ArithmeticOperationService {
    //    Metoda statica ce nu previne exceptia neverificata
    public static int divideIntNoExceptionHandling(int a, int b) {
        return a / b;
    }

    //    Metoda statica ce previne exceptia neverificata
    public static int divideIntWithExceptionHandling(int a, int b) {
        try {
            int result = a / b;
            return result;
        } catch (Exception capturedException) {
            System.out.println("An exception has occurred: " + capturedException.getMessage());
            return 0;
        }
    }
}
