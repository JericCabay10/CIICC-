package Chapter5;

public class PolyMorphysimLesson {//PolyMorphysimLesson
    public static void main(String[] args) {//
        Lemur lemur = new Lemur(); //Creating instance of Lemur class
        Object lemurObject = new Lemur(); //Upcasting to Object class
    
        System.out.println();   //Printing a blank line for better readability

        Primate primate = lemur; //Upcasting to Primate class
        HasTail hasTail = lemur; //Upcasting to HasTail interface
        Lemur lemur2 = (Lemur) primate; //Downcasting back to Lemur class
        System.out.println("Lemur " + lemur2.age); //Accessing age variable from Lemur class
        System.out.println("Primate " + primate.hasHair());//Accessing hasHair method from Primate class
        System.out.println("HasTail " + hasTail.isTailStriped()); //Accessing isTailStriped method from HasTail interface
        System.out.println("Lemur " + lemur.age); //Accessing age variable from Lemur class
        System.out.println("Lemur " + lemur.isTailStriped()); //Accessing isTailStriped method from HasTail interface
        System.out.println("Lemur " + lemur.hasHair()); //Accessing hasHair method from Primate class
    } //End of main method
}   //End of PolyMorphysimLesson class

class Lemur extends Primate implements HasTail {//Implementing HasTail interface
   int age = 10;   //Variable specific to Lemur class

   @Override //Implementing method from HasTail interface
   public boolean isTailStriped() { //Overriding isTailStriped method
    return true; //Returning true for striped tail
   } //End of isTailStriped method

} //End of Lemur class

interface HasTail { //Interface declaration
    boolean isTailStriped(); //Method to check if tail is striped
} //End of HasTail interface

class Primate{ //Base class
    boolean hasHair() { //Method to check if primate has hair
        return true; // Returning true for having hair
    } //End of hasHair method
}   //End of Primate class