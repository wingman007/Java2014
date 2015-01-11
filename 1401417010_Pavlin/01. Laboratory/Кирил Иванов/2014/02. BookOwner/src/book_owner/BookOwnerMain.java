package book_owner;

public class BookOwnerMain {

    public static void main(String[] args) {
        
        BookOwner owner1 = new BookOwner("Иван", "Конго");
        BookOwner owner2 = new BookOwner("Стоян", "Конго");
        BookOwner owner3 = new BookOwner("Марин", "Бягство от свободата");
        
        owner1.intro();
        owner2.intro();
        owner3.intro();
        
        CompareBookTitle compare = new CompareBookTitle();
        
        compare.compareBookTitle(owner1, owner2);
        compare.compareBookTitle(owner1, owner3);
    }
}
