package Chapter1;

public class ConstructorLessonOne {
    public static void main(String[] args) {
        Chicken c1 = new Chicken();
        Chicken c2 = new Chicken();
        System.out.println();
    }
    
}

class Chicken {
    int numEggs = 0;
    String name;
    public Chicken() {

    }   
}

class Swan {
    int numberEggs;
    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberEggs = 1; // writing Object fields
        System.out.println("Swan number of eggs " + mother.numberEggs); // reading object field
    }
}

class Name {
    String first = "Jeric ";
    String last = "Cabay";
    String full = first + last;
    public static void main(String[] args) {
        Name name = new Name();
        System.out.println("Full name: " + name.full);

    }
}