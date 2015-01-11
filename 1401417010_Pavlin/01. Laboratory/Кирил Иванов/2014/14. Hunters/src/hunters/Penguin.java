package hunters;

public class Penguin implements IAnimals {
    
    private String name;
    private String type;
    private boolean flying;

    protected String getType() {
        return type;
    }
    
    protected String getName() {
        return name;
    }
    
    protected boolean isFlying() {
        return flying;
    }
    
    protected final void setName(String name) {
        this.name = name;
    }
    
    protected final void setType(String type) {
        this.type = type;
    }

    protected final void setFlying(boolean flying) {
        this.flying = flying;
    }

    protected Penguin(String name, String type, boolean flying) {
        setName(name);
        setType(type);
        setFlying(flying);
    }
    
    @Override
    public String returnParam() {
        
        String returnString;
        
        if(flying == true) {
            
            returnString = "Животното лети";
        }
        
        else {
            
            returnString = "Животното не лети";
        }
        
        return getName() + " от клас " + getType() + ". " + returnString;
    }
}