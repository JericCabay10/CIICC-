package otherFolder;

import Chapter4.AccessModfierLesson;
import Chapter4.VarargsLesson;
import toys.Toy;

public class sunFlower {
    public static void main(String[] args) {
        // Toy toy1 = new Toy();
        // System.out.println(toy1);

        AccessModfierLesson acm1 = new AccessModfierLesson();
        acm1.greetMe();
        // acm1.greetMe2();
        // acm1.greetMe3();
        acm1.greetMe4();
    }
}

class MoonFlower extends AccessModfierLesson {
    public static void main(String[] args) {
        MoonFlower mf = new MoonFlower();
        mf.greetMe();
        mf.greetMe2();
        mf.greetMe3();  //Protected
        // mf.greetMe4(); //Default
        System.out.println(VarargsLesson.marsGravity);
    }
}