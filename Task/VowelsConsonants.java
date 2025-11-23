package Task;

import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
				
		while(true) {
			System.out.print("Enter a character: ");
			char chr = input.next().charAt(0);
			
			if((chr >= 'A' && chr <= 'Z') || (chr >= 'a' && chr <= 'z')) {
				if(chr == 'A' || chr == 'E' || chr == 'I' || chr == 'O' || chr == 'U' || 
						chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u') {
					System.out.println(chr + " Vowels");
				}else {
					System.out.println(chr + " Consonants");
				}
			}else {
				System.out.println("Invalid Alphabet");
			}
		}
	}
}
    