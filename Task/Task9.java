package Task;

import java.util.Scanner;

public class Task9 {
    public static int sum(int a , int b) {
        int add = Math.addExact(a, b);
        return add;
    }

    public static int multiply(int a, int b) {
        int multi = Math.multiplyExact(a, b);
        return multi;
    }

    public static int  minus(int a, int b) {
        int sub = Math.subtractExact(a, b);
        return sub;
    }

    public static int divide(int a, int b) {
        int div = Math.floorDiv(a, b);
        return div;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) { 
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();

            if(num1 == 0) {
                break;
            }
    
            System.out.print("Enter operation (+, -, *, /): ");
            char operation = input.next().charAt(0);

            System.out.print("Enter second number: ");
            int num2 = input.nextInt();

            switch (operation) {
                case '+':
                    System.out.println("Result: " + sum(num1, num2));
                    break;
                case '-':
                    minus(num1, num2);
                case '*':
                    multiply(num1, num2);
                case '/':
                    if (num2 != 0) {
                        divide(num1, num2);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                default:
                    System.out.println("Invalid operation. Please try again.");
            }
        }
    }
}
