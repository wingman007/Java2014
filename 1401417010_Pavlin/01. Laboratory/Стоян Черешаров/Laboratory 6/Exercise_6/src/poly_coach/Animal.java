package poly_coach;

class Animal implements INoisable {
    
    private String name;
    
    public String getName() {
        return name;
    }
    
    public final void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        setName(name);
    }
    
    @Override
    public void makeNoise() {
        System.out.println("I am an " + getName() + " and I make Grr");
    } 
}
