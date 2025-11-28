package Task.Task10;

public class Students {
    private String firstName;
    private String lastName;

    public Students(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void fullName() {
        System.out.println(("Student name: ") + firstName + " " + lastName);
    }
}

