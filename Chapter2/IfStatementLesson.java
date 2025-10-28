public class IfStatementLesson {
    public static void main(String[] args) {
        int hourOfday = 15;

        // if(hourOfday < 11)
        //     System.out.println("first statment");
        // else 
        //     System.out.println("second statement");
        //     System.out.println("third statment");

        // if, else-if, else
    
        if(hourOfday <= 18)
            System.out.println("Good eve");
        else if (hourOfday <= 12)
            System.out.println("Good afternoon");
        else
            System.out.println("Good morning");


        // (boolean expression) ? T : F;
        System.out.println((hourOfday >= 18) ? "good eve" : (hourOfday <= 19) ? "good afternoon" : "goodmorning");

    }
}
