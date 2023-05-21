package com.marianamoiseiqa.operationsandcyclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        int a = 500;
        int limit = 500;

        while (a > 0) {
            System.out.print(a + ", ");
            //a = a - 1;
            // a -= 1;
            a--;
        }

        //Valoare lui a dupa ce iese din ciclul while este 0

        System.out.println();
        do {
            System.out.print(a + ", ");
            a++;
        } while (a < limit);

        System.out.println();

        for (int i = 0; i <= limit; i++) {
            System.out.print(i + ", ");

        }
        System.out.println();
        for (int i = 0; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            } else
                System.out.print("[], ");
        }

    }
}
