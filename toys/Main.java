package toys;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();

        Toy toy1 = new Toy();

        toy1.name = "Gundam";
        toy1.brand = "V1";
        toy1.price = 150.50;
        toy1.quantity = 6;
        
        System.out.println(toy1.name);

        System.out.println(r.nextInt(100));
    }
}
