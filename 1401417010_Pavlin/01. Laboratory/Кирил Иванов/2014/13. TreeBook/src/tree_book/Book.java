package tree_book;

public class Book implements ITreeBook {   
    
    private String name;
    private String author;
    
    protected String getName() {
        return name;
    }

    protected String getAuthor() {
        return author;
    }
    
    protected final void setName(String name) {
        this.name = name;
    }

    protected final void setAuthor(String author) {
        this.author = author;
    }

    protected Book(String name, String author) {
        setName(name);
        setAuthor(author);
    }
    
    @Override
    public String returnParam() {
        
        return "Книгата е със заглавие \"" + getName() + "\" и е от автор \"" + getAuthor() + "\".";
    } 
}
