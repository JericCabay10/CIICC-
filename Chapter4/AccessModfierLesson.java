package Chapter4;

public class AccessModfierLesson {
    public void greetMe() {
        System.out.println("Hello From java public person");    
    }

    protected void greetMe2() {
        System.out.println("Hello From java private person");    
    }

    protected void greetMe3() {
        System.out.println("Hello From java protected person");    
    }

    void greetMe4() {
        System.out.println("Hello From java default person");    
    }

    public static void main(String[] args) {
        AccessModfierLesson acm1 = new AccessModfierLesson();
        acm1.greetMe();
        acm1.greetMe2();
        acm1.greetMe3();
        acm1.greetMe4();
    }
}

class ClassZ {
    public static void main(String[] args) {
        AccessModfierLesson acm1 = new AccessModfierLesson();
        acm1.greetMe();
        //acm1.greetMe2();
        acm1.greetMe3();
        acm1.greetMe4();
    }
}