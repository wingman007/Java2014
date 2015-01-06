package owner_hierarchy;

public class Owner {

    private String name;
    private Fruits fruits;
    
    protected String getName() {
        return name;
    }
    
    protected Fruits getFruits() {
        return fruits;
    }
    
    protected final void setName(String name) {
        this.name = name;
    }

    protected final void setFruits(Fruits fruits) {
        this.fruits = fruits;
    }

    protected Owner(String name, Fruits fruit) {
        setName(name);
        setFruits(fruit);
    }
    
    protected void printParam() {
        
        System.out.println("Името на собственика е " + getName() + ".");
        System.out.println(getFruits());
    }
}
