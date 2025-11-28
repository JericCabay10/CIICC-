package Task;

import java.util.Scanner;

public class Task7 {
    public static int sum(int a , int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int  minus(int a, int b) {
        return a - b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) { 
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();
    
            System.out.print("Enter operation (+, -, *, /): ");
            char operation = input.next().charAt(0);

            System.out.print("Enter second number: ");
            int num2 = input.nextInt();


            switch (operation) {
                case '+' -> System.out.println("Result: " + sum(num1, num2));
                case '-' -> System.out.println("Result: " + minus(num1, num2));
                case '*' -> System.out.println("Result: " + multiply(num1, num2));
                case '/' -> {
                    if (num2 != 0) {
                        System.out.println("Result: " + divide(num1, num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                }
                default -> System.out.println("Invalid operation. Please try again.");
            }
        }
    }
}