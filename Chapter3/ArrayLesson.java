
import java.util.Arrays;


public class ArrayLesson {
    public static void main(String[] args) {
        int[] arr = {6, 4, 9, 5, 3, 1, 2, 8, 7, 10};
        Arrays.sort(arr);

        

        for(int num : arr) {
            System.out.print(num + ", ");
        }
        System.out.println();

        String[] str1 = {"6", "4", "9", "5", "3", "1", "2", "8", "7"};
        Arrays.sort(str1);

        for(String str : str1) {
            System.out.print(str + ", ");
        }
        System.out.println();

        int[][] diffsize = {{1,2}, {3}, {9, 8, 7}};
        System.out.println(diffsize[1][0]);
    }
}

// class Student{
//     String Fullname;
//     int age;
//     String address;
//     String course;
//     int yearLevel;
// }
