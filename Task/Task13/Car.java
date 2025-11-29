package Task.Task13;

public class Car extends Vehicle{
    private int numOfDoors;

    public Car(String make, String model, int year, int numOfDoors) {
        super(make, model, year);
        this.numOfDoors = numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public int getNumberOfDoors() {
        return this.numOfDoors;
    }

    public void displayDetails() {
        System.out.println("Car Details: ");
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Number of Doors: " + getNumberOfDoors());
        System.out.println("");
    }
}
