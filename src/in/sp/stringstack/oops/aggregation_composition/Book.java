package in.sp.stringstack.oops.aggregation_composition;

public class Book {
    private String Author;
    private String bookName;
    private int price;

    public Book(String author, String bookName, int price) {
        Author = author;
        this.bookName = bookName;
        this.price = price;
    }

    public String getAuthor() {
        return Author;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPrice() {
        return price;
    }
}
