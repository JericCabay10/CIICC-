public class Task3 {
    public static void main(String[] args) {
        String a = "Wow";
        String b = "Wow";
        String c = "Wow!";
        String d = "Wow!";

        boolean b1 = a.equals(b);
        System.out.println(b1);

        boolean b2 = d.equals(b + "!");
        System.out.println(b2);

        boolean b3 = !c.equals(a);
        System.out.println(b3);

        if (b1 && b2 && b3) {
            System.out.println("Success");
        }
}