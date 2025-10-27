package Chapter2;

public class OperatorLesson {
    public static void main(String[] args) {
        System.out.println(2 << 2);
        // 0 0 1 0
        // 8 4 2 1

        System.out.println(15 >> 1);
        System.out.println(+3 + -(+6));
        System.out.println(+3 + +6);
        System.out.println(+3 - +6);
        System.out.println();

        int a = 0;

        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a++ + ++a);
        System.out.println();

        int b = 0;

        System.out.println(++b);
        System.out.println();

        // boolean x = false;
        // System.out.println(x);
        // x = !x;
        // System.out.println(x);

        double x = 1.21;
        System.out.println(x);
        x = -x;
        System.out.println(x);
        x = +x;
        System.out.println(x);

        int in = (int) 1.0;

        short sh = (short) 1921222;
        System.out.println();


        short d = 10;
        short e = 30;
        short c = (short) (d * e);
        System.out.println("c = " + c);

        int y = 9;

        boolean f = true || (y < 4);
        System.out.println(f);

        int g = 1;
        System.out.println(g++ + ++g);
    }
}
