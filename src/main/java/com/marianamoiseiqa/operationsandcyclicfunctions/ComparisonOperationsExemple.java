package com.marianamoiseiqa.operationsandcyclicfunctions;

public class ComparisonOperationsExemple {

        public static void main(String[] args) {
            int a = 17;
            int b = 12;

//   Equal comparison operation
            boolean isEqual = a == b;
            System.out.println("Numbers are equal: " + isEqual);
//   Difference comporison operation
            boolean isNotEqual = a != b;
            System.out.println("Numbers aren't equal: " + isNotEqual);
//   Greater than comparison operation
            boolean isGreaterThan = a > b;
            System.out.println("A is greater than b: " + isGreaterThan);
//   Greater than or equal to comparison operation
            boolean isGreaterOrEqual = a >= b;
            System.out.println("A is greater than or equal to b: " + isGreaterOrEqual);
//   Smaller comparison operation
            boolean isSmallerThan = a < b;
            System.out.println("A is smaller than b: " + isSmallerThan);
//   Smaller than or equal to comparison operation
            boolean isSmallerorEqual = a <= b;
            System.out.println("A is smaller or equal to b:" + isSmallerorEqual);
        }
}
