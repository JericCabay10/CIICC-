package Task;

import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
				
		while(true) {
			System.out.print("Enter a  String: ");
			String str = input.nextLine();
			
			System.out.println("Original: " + str);
			System.out.println("Length of String: " + str.length());
			System.out.println("Upper Case: " + str.toUpperCase());
			System.out.println("Lower Case: " + str.toLowerCase());
			System.out.println("First Char: " + str.charAt(0));
			System.out.println("Last Char: " + str.charAt(str.length() - 1));
			
			
			
		}
    }
}
