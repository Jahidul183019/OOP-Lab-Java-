import java.util.*;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void add(Book b){ books.add(b); }

    public Book findByTitle(String title){
        // TODO: return first match or null
        // throw new UnsupportedOperationException("TODO");
        for (Book b : books){
        if (b.getTitle().equals(title)) return b;
    }
    return null;
    }

    public ArrayList<Book> borrowedBooks(){
        // // TODO: return list of currently borrowed books
        // throw new UnsupportedOperationException("TODO");
       ArrayList<Book> borrowed = new ArrayList<>();
    for (Book b : books) {
        if (b.isBorrowed()) {
            borrowed.add(b);
        }
    }
    return borrowed;
}


}
