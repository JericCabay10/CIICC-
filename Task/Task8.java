package Task;

public class Task8 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 10};
        int length = arr.length;

        for(int a = 0; a < length; a++) {
            int sum = 0;
            for(int b = 1; b <= arr[a]; b++) {
                System.out.print(b);
                if(b < arr[a]) {
                    System.out.print(" + ");
                }
                sum += b;
            }
            System.out.print(" = " + sum);
            System.out.println();
        }

    }
}