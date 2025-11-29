package Task.Task11;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "Jhon Smith", 2021, 39.99, 1);
        b1.bookInfo();

        Book b2 = new Book("Python Programming", "Jane Doe", 2020, 29.99, 2);
        b2.bookInfo();

        Book b3 = new Book("C++ Programming", "Alice Johnson", 2019, 49.99, 3);
        b3.bookInfo(); 
    }
}
