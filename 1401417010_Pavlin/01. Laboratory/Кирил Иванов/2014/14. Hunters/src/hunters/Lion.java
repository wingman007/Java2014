package hunters;

public class Lion implements IAnimals {

    private String name;
    private String type;
    private String category;

    protected String getName() {
        return name;
    }
    
    protected String getType() {
        return type;
    }
    
    protected String getCategory() {
        return category;
    }
    
    protected final void setName(String name) {
        this.name = name;
    }
    
    protected final void setType(String type) {
        this.type = type;
    }

    protected final void setCategory(String category) {
        this.category = category;
    }

    protected Lion(String name, String type, String category) {
        setName(name);
        setType(type);
        setCategory(category);
    }

    @Override
    public String returnParam() {
        
        return getName() + " от клас " + getType() + ", разред " + getCategory();
    }
}