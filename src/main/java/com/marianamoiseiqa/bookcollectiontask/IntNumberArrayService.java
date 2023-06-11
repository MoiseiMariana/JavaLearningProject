package com.marianamoiseiqa.bookcollectiontask;

public class IntNumberArrayService {
    //    Metoda statica ce determina valoarea minima
    public static int getTheMinValueOfTheArray(int[] intArray) {
        int minValue = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < minValue) {
                minValue = intArray[i];
            }
        }
        return minValue;
    }

    //    Metoda statica ce returneaza indexul valorii minime
    public static int getTheMinValueIndexOfTheArray(int[] intArray) {
        int minValue = intArray[0];
        int index = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < minValue) {
                minValue = intArray[i];
                index = i;
            }
        }
        return index;
    }

    //    Metoda statica ce returneaza media aritmetica a valorilor dintr-un array
    public static int getTheArithmeticAverageOfTheElements(int[] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum = sum + intArray[i];
        }
        return sum / intArray.length;
    }
}
