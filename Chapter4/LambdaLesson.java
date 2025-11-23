package Chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaLesson {

    static void print(List<Animal> animals, Predicate<Animal> checker) {
        for(Animal a : animals) {
            if(checker.test(a)) {
                System.out.println(a.getSpecies() + " ");
            }
        }
    }
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true, 1));
        animals.add(new Animal("kangaroo", true, false, 3));
        animals.add(new Animal("rabbit", true, false,   2));
        animals.add(new Animal("turtle", false, true,   5));
        animals.add(new Animal("Frog", true, true,   10));
        animals.add(new Animal("Kuala", false, false,   6));
        

        // System.out.println("Animals that can hop:");
        // print(animals, new CheckIfHopper());

        // System.out.println("Animals that can swim:");
        // print(animals, new CheckIfSwimmer());

        System.out.println("Animals that can hop:");
        print(animals, a -> a.canHop());

        System.out.println("\nAnimals that can swim:");
        print(animals, a -> a.canSwim());

        System.out.println("\nAnimals that can hop and swim:");
        print(animals, a -> a.canSwim() && a.canHop());

        System.out.println("\nAnimals that cannot hop or swim:");
        print(animals, a -> (!a.canSwim() && !a.canHop()));


        NumberInterface add = (a, b) -> a + b;
        NumberInterface diff = (a, b) -> a - b;
        NumberInterface product = (a, b) -> a * b;
        NumberInterface qou = (a, b) -> a / b;

        System.out.println("\nAddition: " + add.operator(10, 5));
        System.out.println("Subtraction: " + diff.operator(10, 5));
        System.out.println("Multiplication: " + product.operator(10, 5));
        System.out.println("Division: " + qou.operator(10, 5));

        DiscountItem percentTen = (x) -> (x - (x * 0.10));
        DiscountItem percentTwenty = (x) -> (x - (x * 0.20));
        DiscountItem percentThirty = (x) -> (x - (x * 0.30));
        DiscountItem percentFourty = (x) -> (x - (x * 0.40));
        DiscountItem percentFifty = (x) -> (x - (x * 0.50));

        int kickBack = 10_000_000;
        System.out.println(percentTen.dc(kickBack));
        System.out.println(percentTwenty.dc(kickBack));
        System.out.println(percentThirty.dc(kickBack));
        System.out.println(percentFourty.dc(kickBack));
        System.out.println(percentFifty.dc(kickBack));

        System.out.println(animals);
        animals.removeIf(a -> a.canHop());
        System.out.println(animals);

    }   
}

class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;
    private int age;

    public Animal(String speciesName, boolean hopper, boolean swimmer, int age) {
        this.species = speciesName;
        this.canHop = hopper;
        this.canSwim = swimmer;
        this.age = age;
    }

    public boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }
 }


//  interface CheckTrait {
//     boolean test(Animal a);
//  }

//  class CheckIfHopper implements CheckTrait {
//     public boolean test(Animal a) {
//         return a.canHop();
//     }
//  }

//   class CheckIfSwimmer implements CheckTrait {
//     public boolean test(Animal a) {
//         return a.canSwim();
//     }
//  }

interface NumberInterface {
    int operator(int a, int b);
}

interface DiscountItem {
    double dc(double price);
}