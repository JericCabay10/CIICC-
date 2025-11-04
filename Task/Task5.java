import java.util.*;

public class Task5 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) { 
            System.out.print("First number ");
            int a = input.nextInt();

            if(a == 0) {
                System.out.println("Exit...");
                break;
            }

            System.out.print("Second number: ");
            int b = input.nextInt();

            System.out.print("Third number: ");
            int c = input.nextInt();

            if(a == b && b == c) {
                System.out.println("All numbers are equals");
            }else if(a >= b && a >= c) {
                System.out.println(a + " Is the largest number");
            }else if(b >= a && b >= c) {
                System.out.println(b + " Is the largest number");
            }else if(c >= a && c >= b) {
                System.out.println(c + " Is the largest number");
            }
        }
    }
}
