package LawnSharkApp;

public class LawnSharkApp {
    
}

class Lawner {
    private String name;
    private String address;
    private double lawnAmount;
    private float interest;

    public Lawner( String name, String address, double lawnAmount, float interest) {
        this.name = (isStringvalid(name) ? name : "");
        this.address = address;
        this.lawnAmount = lawnAmount;
        this.interest = interest;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLawnAmount() {
        return lawnAmount;
    }
    
    void payLawnAmount(double payment) {
        if(isNumbervalid(payment)) {
            setLawnAmount(lawnAmount - payment);
        }else {
            throw new RuntimeException("Invalid payment amount");
        }
    }

    private boolean isNumbervalid(double payment) {
        return (payment >= 1) ? true : false;
    }
     
    private boolean isStringvalid(String text) {
        return (text.length() >= 1) ? true : false;
    }

    private void setLawnAmount(double lawnAmount) {
        this.lawnAmount = lawnAmount;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }
    
    public static void main(String[] args) {
        Lawner user1 = new Lawner("John Doe", "123 Main St", 44_000_000_000.00, 12.0f);

        user1.setName("Jane Doe");

        System.out.println(user1.getAddress());
    }
}