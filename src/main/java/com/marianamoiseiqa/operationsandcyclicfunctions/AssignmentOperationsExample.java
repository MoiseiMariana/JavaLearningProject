package com.marianamoiseiqa.operationsandcyclicfunctions;

public class AssignmentOperationsExample {
    public static void main(String[] args) {
        int c = 25;
        int d = 8;
        int e = 4;

//   Atribuire simpla
        int result = c;
        System.out.println("Atribuire simpla: " + result);
//   Atribuire cu adunare
        result += d;
        System.out.println("Atribuire cu adunare: " + result);
//   Atribuire cu scadere
        result -= e;
        System.out.println("Atribuire cu scadere: " + result);
//   Atribuire cu imultire
        result *= d;
        System.out.println("Atribuire cu inmultire: " + result);
//   Atribuire cu impartire
        result /= e;
        System.out.println("Atribuire cu impartire: " + result);
//   Atribuire cu restul impartirii
        result %= d;
        System.out.println("Atribuire cu restul impartirii: " + result);
    }
}
