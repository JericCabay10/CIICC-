package Chapter5;

public class Lawner {
    private int id; // Unique identifier
    private String first_name; // First name of the lawner
    private String last_name; // Last name of the lawner
    private String email; // Email address
    private String gender; // Gender
    private double amount;  // Amount associated with the lawner

    // Constructor
    public Lawner(int id, String first_name, String last_name, String email, String gender, double amount) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }
    // Getters and Setters
    public int getId() {
        return id; 
    }

    public void setId(int id) {
        this.id = id; 
    }

    public String getFirst_name() {
        return first_name; 
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name; 
    }

    public String getLast_name() {
        return last_name; 
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name; 
    }

    public String getEmail() {
        return email; 
    }

    public void setEmail(String email) {
        this.email = email; 
    }

    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("First Name: " + first_name);
        System.out.println("Last Name: " + last_name);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Amount: " + amount);
    }
}
