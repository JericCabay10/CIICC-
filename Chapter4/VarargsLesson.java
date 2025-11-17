package Chapter4;

public class VarargsLesson {
    public int sumOfAllNums(int... y) {
        int sum = 0;

        for(int num : y) {
            sum += num;
        }        
        return sum;
    }
    
    public int sumOfAllNums2(String h, int p, int... y) {
        int sum = 0;
        
        System.out.println(h);
        for(int num : y) {
            sum += num;
        }        
        return sum;
    }

    public static float getEarthsGravity() {
        return 9.8f;
    }

    int counter;
    public static float marsGravity = 3.72f;
    final static int COUNTDOWN = 10;

    public static void main(String[] args) {
        VarargsLesson v1 = new VarargsLesson();
        VarargsLesson v2 = new VarargsLesson();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(v1.sumOfAllNums(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(v1.sumOfAllNums(arr));

        System.out.println(v1.sumOfAllNums2("hello", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println(getEarthsGravity());
        System.out.println(marsGravity);

        v1.marsGravity = 100;
        v1.counter = 3;
        System.out.println(v1.marsGravity);
        System.out.println(v1.counter);
        v1 = null;                      
        System.out.println(v1.marsGravity);
        //System.out.println(v1.counter);

        COUNTDOWN = 100;

    }    
}
