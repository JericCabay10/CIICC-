package Chapter4;

public class ReturnTypeLesson {
    void startEngine() {
        System.out.println("Engine is running");
    }

    int getAge() {
        return (byte) 23;
    }

    Avocado getAvocado() {
        return null;
    }

    boolean oddOrEven(int a) {
        boolean result = (a % 2 == 0) ? true : false;

        return result;
    } 

    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        ReturnTypeLesson rp = new ReturnTypeLesson();

        System.out.println("Good morning you are now " + rp.getAge() + " years old");
        System.out.println("Result " + rp.oddOrEven(3));
        System.out.println("Result " + rp.add(2, 3));
    }
}

class Avocado{

}
