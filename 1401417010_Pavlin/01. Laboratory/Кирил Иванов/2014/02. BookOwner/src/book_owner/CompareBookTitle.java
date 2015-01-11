package book_owner;

public class CompareBookTitle {
    
    protected void compareBookTitle(BookOwner book1, BookOwner book2) {
        
        if(book1.getBookTitle().matches(book2.getBookTitle())) {
            
            System.out.println("Книгите \"" + book1.getBookTitle() + "\" и \"" + book2.getBookTitle() + "\" са с едно и също заглавие.");
        }
        
        else {
            
            System.out.println("Книгите \"" + book1.getBookTitle() + "\" и \"" + book2.getBookTitle() + "\" са с различно заглавие.");
        }
    }
}
