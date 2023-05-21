package com.marianamoiseiqa.operationsandcyclicfunctions;

public class IncrementDecrementExemple {
    public static void main(String[] args) {
        int a = 20;

//   Increment operation
        a++;
        // a = 21;
        System.out.println("Valoarea lui a: " + a);
//   Pre - increment operation
        ++a;
        // a = 22;
        int b = ++a;
        // a = 23; b = 23;
        int a1 = a;
        // a = 23;
        int c = a++;
        // a = 24; b = 23;
        System.out.println("Valoarea lui a dupa incrementare pre-fixata: " + a);
        System.out.println("In timp ce b: " + b + " a1= " + a + " c= " + c);
//   Decrement operation
        a--;
        // a = 23;
        System.out.println("Valoarea lui a dupa decremrentare: " + a);
//   Pre - decrement operation
        --a;
        // a = 22;
        System.out.println("Valoarea lui a dupa decrementare pre-fixata:" + a);
    }
}
