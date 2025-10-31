import java.util.*;

public class Problem5Test {
    public static void main(String[] args){
        Library L = new Library();
        Book a = new Book("Clean Code","Martin");
        Book b = new Book("DDD","Evans");
        L.add(a); L.add(b);

        a.borrow("Ana","2025-09-01");
        Assert.assertTrue(a.isBorrowed(), "P5: a borrowed");
        Assert.assertEquals("Ana", a.getBorrower().getName(), "P5: borrower name");

        ArrayList<Book> bs = L.borrowedBooks();
        Assert.assertEquals(1, bs.size(), "P5: borrowed count");
        Assert.assertEquals("Clean Code", bs.get(0).getTitle(), "P5: borrowed title");

        boolean thrown = false;
        try { a.borrow("Ben","2025-09-02"); } catch(IllegalStateException e){ thrown = true; }
        Assert.assertTrue(thrown, "P5: double borrow rejected");

        a.giveBack();
        Assert.assertTrue(!a.isBorrowed(), "P5: returned");
        Assert.summary();
    }
}
