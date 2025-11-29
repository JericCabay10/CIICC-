package Task.Task11;

public class Book {
    private String title;
    private String author;
    private int yearPublilshed;
    private double price;
    private int count;

    public Book(String title, String author, int yearPublilshed, double price, int count) {
        this.title = title;
        this.author = author;
        this.yearPublilshed = yearPublilshed;
        this.price = price;
        this.count = count;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setyearPublilshed(int yearPublilshed) {
        this.yearPublilshed = yearPublilshed;
    }

    public int getyearPublilshed() {
        return this.yearPublilshed;
    }

    public void setPice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getCount() {
        return this.count;
    }

    public void bookInfo() {
        System.out.println("Book: " + this.count);
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Year Published: " + this.yearPublilshed);
        System.out.println("Price: $" + this.price);
        System.out.println();
    }
}
