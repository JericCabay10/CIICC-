package Task;

import java.util.Scanner;

public class CountTheWord {
    public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
				
		while(true) {
			System.out.print("Enter a String: ");
			String  str = input.nextLine();
			
			boolean inWord = false;
			int count = 0;
			
			for(int a = 0; a < str.length(); a++) {
				char chr = str.charAt(a);
				
				if(chr != ' ' && chr != '\t' && chr != '\n') {
					if(!inWord) {
						count++;
						inWord = true;
					}
				}else {
					inWord = false;
				}
			}
			System.out.println(count);
		}
	}
}
