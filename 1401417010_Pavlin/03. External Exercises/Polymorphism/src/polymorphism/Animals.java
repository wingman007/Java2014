package polymorphism;

public class Animals {
    
    private String name;
    private String favFood;

    public String getName() {
        return name;
    }

    public String getFavFood() {
        return favFood;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final void setFavFood(String favFood) {
        this.favFood = favFood;
    }
    
    public void walkAround(){

        System.out.println(this.name + " walks around.");
    }

    public Animals() {
    }

    public Animals(String name, String favFood) {
        setName(name);
        setFavFood(favFood);  
    }
}
