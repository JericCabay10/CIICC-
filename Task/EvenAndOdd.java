package Task;

import java.util.Scanner;

public class EvenAndOdd {
public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
				
		while(true) {
			System.out.print("Enter a number: ");
			int num = input.nextInt();
			
			
			if(num == 0) {
				System.out.println("The input is zero");
			}else if(num % 2 == 0) {
				if(num > 0) {
					System.out.println("The number is positive even number");
				}else {
					System.out.println("The number is negative even number");
				}
			}else if(num % 2 != 0) {
				if(num > 0) {
					System.out.println("The number is positive odd number");
				}else {
					System.out.println("The number is negative odd number");
				}
			}
            System.out.println();
		}
	}
}
