package Task.Task12;

public class Task12 {
    public static void main(String[] args) {
        Point p = new Point(32, 32);
        
        for(int a = 0; a < 5; a++) {
            p.scale();
            p.print();
        }
    }
}
