import java.util.*;

public class ArrayListLEsson {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();

        list1.add(1);
        list1.add('c');
        list1.add(true);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(21);
        list2.add(11);
        list2.add(4);
        list2.add(42);
        list2.add(14);

        System.out.println(list1 + " ");
        System.out.println(list2 + " ");
        System.out.println(list2.add(2));

        list2.add(0, 10);
        System.out.println(list2);

        int i = 10;
        Integer I = 10;

        List nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        
        System.out.println(nums);

        nums.remove(1); 

        List nums2 = Arrays.asList(8, 7, 2, 3, 4 ,1, 6, 5, 9, 4);
        Collections.sort(nums2);
        System.out.println(nums2);

        Collections.reverse(nums2);
        System.out.println(nums2);

        Collections.shuffle(nums2);
        System.out.println(nums2);
        
    }
}
