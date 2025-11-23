package Task;

public class SumOfDigit {
    public static void main(String[] args) {
				
		int num = 12345;
		int temp = num;
		int sum = 0;
		
		while(num != 0) {
			int digit = num % 10;
			sum += digit;
			num /= 10;
		}
		
		System.out.println("The number of digit = " + temp);
		System.out.println("Sum of the number of digit = " + sum);
	}
}
