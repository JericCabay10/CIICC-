package Task;

public class SumAndAverage {
    public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int length = arr.length;
		int sum = 0;
		
		
		System.out.print("Array Element = ");
		for(int i : arr) {
			System.out.print(i + ", ");
		}
		
		for(int a = 0; a < arr.length; a++) {
			sum += arr[a];
		}
		
		double average = sum / length;
		
		System.out.println("\nSum of array element: " + sum);
		System.out.println("The average of array element: " + average);
	}
}
