package tree_book;

public class TreeBookMain {

    public static void main(String[] args) {
        
        ITreeBook tree = new Tree("дъб", 24);
        ITreeBook book = new Book("Тъй рече Заратустра", "Фридрих Ницше");
        
        System.out.println(tree.returnParam());
        System.out.println(book.returnParam());
    }
}
