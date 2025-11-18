package Chapter4;

public class ConstructorLesson {
    public static void main(String[] args) {
        Bunny b1 = new Bunny("Bugs");
        Bunny b2 = new Bunny("Lola");
       
        System.out.println();
        Hamster h1 = new Hamster(2);
        Hamster h2 = new Hamster(2, "White");

        h1.displayInf();
        h2.displayInf();
    }
}

class Bunny {
    String name;
    public  Bunny(String name) {
        this.name = name;
        System.out.println("This is Bunny Constructor");
    }
}

class Hamster { 
    private String color;
    private int weight;

    public Hamster(int weight) { // First Constructor
        // this.weight = weight;
        // color = "brown";
        this(weight, "brown");
    }

    public Hamster(int weight, String color) { //Second Constructor
        this.weight = weight;
        this.color = color;
    }

    public void displayInf() {
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
    }
}

class Mouse {
    private int numTeeth;
    private int numWhiskers;
    private int weight;
}

class InitializionOrderSimple {
    private String name = "Torchie";

    {
        System.out.println(name);
    }

    private static int COUNT = 0;

    static { System.out.println(COUNT); }
    static { COUNT += 1; System.out.println(COUNT); }
    public InitializionOrderSimple() {}
}

//runtime 
//static
//instance
//Constructor
//SIC