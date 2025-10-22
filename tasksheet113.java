public class tasksheet113 {
    public static void main(String[] args) {
        int check_number = 10;
        String message = "";

        for(int i = 1; i <= check_number; i++) {
            if(i % 2 == 0) {
                message = i + " is even number";
            }else {
                message = i + " is odd number";
            }

            System.out.println(message);
        }

    }
}
