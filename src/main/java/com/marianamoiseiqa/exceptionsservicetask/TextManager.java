package com.marianamoiseiqa.exceptionsservicetask;

public class TextManager {
    //    Metoda statica ce nu previne exceptia neverificata
    public static int getTheTextLengthWithNoTryAndCatch(String inputString) {
        return inputString.length();
    }
    //    Metoda statica ce previne exceptia neverificata
    public static int getTheTextLengthWithTryAndCatchFinally(String inputString) {
        try {
            return inputString.length();
        } catch (NullPointerException capturedExceptionInTryBlock) {
            System.out.println("An exception has been captured with the following message: " + capturedExceptionInTryBlock.getMessage());
            return 0;
        } finally {
            System.out.println("This block is executed whether or not an exception has been captured");
        }
    }

    //    Tratare cu IfElse
    public static int getTheTextLengthIfElse(String inputString) {
        if (inputString == null) {
            System.out.println("Input string is a null value, be careful!");
            return 0;
        } else {
            return inputString.length();
        }
    }
}
