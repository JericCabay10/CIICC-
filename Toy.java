public class Toy {
    String name;
    String brand;
    double price;
    int quantity;

    void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Toy toy1 = new Toy();

        toy1.name = "Gundam";
        toy1.brand = "V1";
        toy1.price = 150.50;
        toy1.quantity = 6;
        toy1.setPrice((toy1.price * 0.5));

        System.out.println("Price: " + toy1.price);
    }
}

class Fruit {
    void fruit() {
        System.out.println("I am fruit");
    }
}

class Fruit1 {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.fruit();
    }
}