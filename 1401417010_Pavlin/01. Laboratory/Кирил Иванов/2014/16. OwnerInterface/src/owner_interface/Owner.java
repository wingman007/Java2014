package owner_interface;

public class Owner {

    private String name;
    private IFruits fruits;
    
    protected String getName() {
        return name;
    }
    
    protected IFruits getFruits() {
        return fruits;
    }
    
    protected final void setName(String name) {
        this.name = name;
    }

    protected final void setFruits(IFruits fruits) {
        this.fruits = fruits;
    }

    protected Owner(String name, IFruits fruit) {
        setName(name);
        setFruits(fruit);
    }
    
    protected void printParam() {
        
        System.out.println("Името на собственика е " + getName() + ".");
        getFruits().printParam();
    }
}
