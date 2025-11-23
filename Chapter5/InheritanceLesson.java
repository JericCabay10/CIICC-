package Chapter5;

public class InheritanceLesson {
    public static void main(String[] args) {
        FinalPArent parent = new FinalPArent();
        // ChildClass child = new ChildClass();
        // child.getChildParent();
    }
}
final class FinalPArent {
    int number;
    void getParent() {
        System.out.println("Parent method");
    }
}

// class ChildClass extends FinalPArent {
//     void getChildParent() {
//         getParent();
//     }
// }

class Animal2 {
    String name;
    int age;
    
    public Animal2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }   
}

class Lion extends Animal2 {
    int lionId;
    public Lion(String name, int age, int lionId) {
        super(name, age);
        this.lionId = lionId;
        System.out.println(super.name);
    }
}

class MountainLion extends Lion {
    String location;
    public MountainLion(String name, int age, int lionId, String location) {
        super(name, age, lionId);
        this.location = location;
        // System.out.println(super.name);
        // System.out.println(super.getName());
    }
}

class Canine { //Overriding example
    public double getAverageWeight() {
        return 50.0;
    }
}

class Wolf extends Canine { //Overriding example
    public double getAverageWeight() {
        return super.getAverageWeight() + 20.0;
    }

    Canine getAnimal() { //Covariant return type
        Wolf wolf = null;
        return wolf;
    }

        Canine getAnimals() {
        Canine canin = null;
        return canin;
    }

    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());

        //Hayop h1 = new Hayop(); //Error: Cannot instantiate the type Hayop
        Dog d1 = new Dog(); //Note: Can instantiate the subclass
        Hayop h2 = new Dog(); //Note: Can create reference of abstract class

        System.out.println(CanBurrow2.isInWater()); //Accessing static method from interface    
    }
}

abstract class Hayop {
    int age;
    String name;

    public void eat() {
        System.out.println("Hayop is eating");
    }

    public abstract String getName();
    public abstract int getAge();
    //public void int getAge(int age)
}

abstract class Mammal extends Hayop {
 abstract void sayInMammal();
    
}
    class Dog extends Mammal {
        
        public String getName() {
            return name;
        }
    
    public int getAge() {
        return age;
    }

    @Override
    void sayInMammal() {
        System.out.println("Im a mammal");
    }

    final void setAge(int age) {

    }


}

abstract interface CanBurrow{//interfaces are implicitly abstract
    public static final int MINIMUM_DEPTH = 2;//implicitly public static final
    public abstract int getMaximumDepth();//implicitly public and abstract
}

interface CanBurrow2 extends CanBurrow {
    int MINIMUM_DEPTH1 = 2;//implicitly public static final
    int getMaximumDepth2();//implicitly public and abstract

    default int getMinDepth() { //default methods can have body in interface
        return 1;
    }

    static boolean isInWater() { //static methods can have body in interface
        return false;
    }
}

class FieldMouse extends Hayop implements CanBurrow, CanBurrow2 {//Implementing multiple interfaces
    public int getMaximumDepth() {//Implementing method from CanBurrow
        return MINIMUM_DEPTH - 1;   //Accessing constant from CanBurrow
    }

    public int getMaximumDepth2() {
        return MINIMUM_DEPTH1;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    @Override
    public int getAge() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAge'");
    }   
}