package Task;

public class StringBuilders {
    public static void main(String[] args) {
            StringBuilder str = new StringBuilder("Programming");
			
            System.out.println("Original String: " + str);
			System.out.println("String Length: " + str.length());
			System.out.println("First Char of String: " + str.charAt(0));
			System.out.println("Last Char of String: " + str.charAt(str.length() - 1));
			System.out.println("Index of the  occurrence of letter 'a': " + str.indexOf("a"));
			System.out.println("Print the substring of 3 to index 6: " + str.substring(3, 6));
			System.out.println("Append 123: " + str.append(123));
			System.out.println("Insert xyz at index 4: " + str.insert(4, "xyz"));
			System.out.println("Delete Character at index 8: " + str.deleteCharAt(8));
			System.out.println("Reverse String: " + str.reverse());
    }
}