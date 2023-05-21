package com.marianamoiseiqa.operationsandcyclicfunctions;

public class LogicalOperationsExemple {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

//   And logic operation (true if both conditions are true)
        boolean result = a && b;
        System.out.println("Logic and: " + result);
//   Not logic operation
        result = a != b;
        System.out.println("Negation: " + result);
//   Or logic operation (true if at list one condition is true)
        result = a || b;
        System.out.println("Logic or: " + result);
    }

}
