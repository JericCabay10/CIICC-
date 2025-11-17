package Chapter4;

public class OverloadingLesson {
    public void fly(int numMiles) {
        System.out.println("int");
    }

    //  public int fly(int numKilometers) {
    //     System.out.println("int");
    // } This duplicate error overloading

    public void fly(short numFeet) {
        System.out.println("short");
    }

    public boolean fly() {
        return false;
    }

    void fly(int numMiles, short numFeet) {
        System.out.println("int short");
    }

    public void fly(short numFeet, int numMiles) throws  Exception {

    }

    public void fly(Object obj) {
        System.out.println("Object");
    }

    public static void main(String[] args) {
        OverloadingLesson oll = new OverloadingLesson();
        short s = 1;
        
        oll.fly(1);
        oll.fly(s);
        System.out.println(oll.fly());
        oll.fly(1, (short) (1));
        
        try {
            oll.fly((short) (1), 1);
        } catch (Exception e) {
            System.out.println("oll.fly((short) (1), 1) has been catch");
        }

        oll.fly(55.6389);   // become object
        oll.fly('c'); // become object
    }
}
