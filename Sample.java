public class Sample {
    // public void methodA(int... nums){}
    // public void methodB(String values, int... nums){}
    // public void methodC(int... nums, String values){}
    // public void methodD(String... values, int... nums){}
    // public void methodE(String[] values, ...int nums){}
    // public void methodF(String... values, int[] nums){}
    // public void methodG(String[] values, int[] nums){}

    public int howMany(boolean b, boolean... b2) {
        return b2.length;
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        System.out.println(sample.howMany()); //returns compilation error
        System.out.println(sample.howMany(true)); // Output: 0
        System.out.println(sample.howMany(true, true)); // Output: 1
        System.out.println(sample.howMany(true, true, true));// Output: 2
        System.out.println(sample.howMany(true, {true})); // Output: 1
        System.out.println(sample.howMany(true, {true, true})); // Output: 2
        System.out.println(sample.howMany(true, new boolean[2])); // Output: 0
    }
}
