public class sample {
    public static void main(String[] args) {
        int total = 0;
        StringBuilder letters = new StringBuilder("abcdefg");
        total += letters.substring(1, 2).length();
        total += letters.substring(6, 6).length();
        total += letters.substring(6, 5).length();
        System.out.println(total);

        int a = 0;
        int b = 0;
        int[][] java = new int[a][b];
    }
}
