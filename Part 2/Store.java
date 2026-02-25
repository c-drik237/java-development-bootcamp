
import java.util.ArrayList;

public class Store {
    
    private ArrayList<Book> books;

    public Store() {
        this.books = new ArrayList<>();
    }

    public Book getBook(int index) {
        return new Book(books.get(index));
    }

    public void setBook(int index, Book book) {
        this.books.set(index, new Book(book));
    }

    public void addBook(Book book) {
        this.books.add(new Book(book));
    }

    public boolean contains(Book book) {
    return this.books.contains(book);
    }

    public void sellBook(String title){
        int i = 0;
        for(Book book : this.books) {
            if (book.getTitle().equals(title)){
                books.remove(i);
                break;
            }   
            i++;
        }
    }




}
