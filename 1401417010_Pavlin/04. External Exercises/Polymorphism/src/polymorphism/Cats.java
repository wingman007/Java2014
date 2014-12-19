package polymorphism;

public class Cats extends Animals {
    
    private String favToy = "Yarn";

    public String getFavToy() {
        return favToy;
    }     

    public final void setFavToy(String favToy) {
        this.favToy = favToy;
    }
    
    @Override
    public void walkAround() {

        System.out.println(getName() + " stalks around.");
    }

    public Cats() {
    }

    public Cats(String name, String favFood, String favToy) {
        
        super(name, favFood);
        setFavToy(favToy);
    }
}
