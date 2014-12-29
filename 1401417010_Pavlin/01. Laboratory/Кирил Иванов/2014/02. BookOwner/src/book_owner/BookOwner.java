package book_owner;

public class BookOwner {

    private String bookOwner;
    private String bookTitle;

    protected String getBookOwner() {
        return bookOwner;
    }

    protected String getBookTitle() {
        return bookTitle;
    }

    protected final void setBookOwner(String bookOwner) {
        this.bookOwner = bookOwner;
    }

    protected final void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    protected BookOwner(String bookOwner, String bookTitle) {
        
        setBookOwner(bookOwner);
        setBookTitle(bookTitle);
    }
    
    protected void intro() {
        System.out.println("Аз се казвам " + getBookOwner() + " и притежавам книгата " + getBookTitle() + ".\n");
    }
}
