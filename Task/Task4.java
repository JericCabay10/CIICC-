import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
            while(true) {
            System.out.print("Enter a word: ");
            String str = input.nextLine();

            String reverse = new  StringBuilder(str).reverse().toString();
        
            System.out.println(str);
            System.out.println(reverse);

            if(str.equals(reverse)) {
                System.out.println("The input string is a palindrome");
            }else {
                System.out.println("The input string is not a palindrome");
            }
        }
    }
}
