import java.util.Scanner;

public class LoopLesson {
    static int num() {
        int num = 5;
        return num;
    }

    public static void main(String[] args) {
        //byte num = 1;

        // while(num < 10)
        //     System.out.println("num = " + num++);
        // System.out.println("End of program");

        // do {
        //     System.out.println("do while num = " + num--);
        //     System.out.println("End of program");
        // } while(num < 10);


        // for(int a = 0; a <= 10; a++) {
        //     System.out.println("a = " + a);
        // }
        //int a = 1;
        
        // for(System.out.println("Initializtion"); a <= 10; System.out.println("Update statement")) {
        //     System.out.println("a = " + a++);
        // }

        //looping statement
        // for(System.out.println("Initializtion"); ; System.out.println("Update statement")) {
        //     System.out.println("a = " + a++);
        // }

        // for(int a = 0; a <= num(); a++) {
        //     System.out.println("a = " + a);
        // }
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        int c = input.nextInt();

        for(int a = 1; a < c; a++) {
            for(int b = 1; b <= a; b++) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
