package Task.Task10;

public class Tasksheet10 {
    public static void main(String[] args) {
        Students[] students = {
            new Students("Morgan", "Freeman"),
            new Students("Brad", "Pitt"),
            new Students("Kevin", "Spacey")
        };

        for(Students student : students) {
            student.fullName();
        }
    }
}
