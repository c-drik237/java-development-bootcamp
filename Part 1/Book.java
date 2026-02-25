public class Book {
    private String title;
    private String author;
    private double rating;
    private double price;

    public Book(String title, String author, double rating, double price) {
        this.author = author;
        this.price = price;
        this.rating = rating;
        this.title = title;
    }

    public Book(Book book) {
        this.title = book.title;
        this.author = book.author;
        this.rating = book.rating;
        this.price = book.price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    
}
