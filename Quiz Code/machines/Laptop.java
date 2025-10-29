package machines;

public class Laptop extends Computer {
    public final int process() {
        return 3;
    }

    public static void main(String[] chips) {
        System.out.print(new Laptop().process());
    }
}
