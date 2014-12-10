package polymorphism;

public class PolyMain {

    public static void main(String[] args) {
        
        System.out.println("\n===== ANIMALS = ANIMALS ======\n");
        
        Animals animal = new Animals("Animal", "Food");
        
        System.out.println(animal.getName());
        System.out.println(animal.getFavFood());
        
        animal.walkAround();
        
        
        
        
        System.out.println("\n===== CATS = CATS ======\n");
        
        Cats cat = new Cats("Morris", "Tuna", "Rubber Mouse");

        System.out.println(cat.getName());
        System.out.println(cat.getFavFood());
        System.out.println(cat.getFavToy());
        
        cat.walkAround();
        
        
        
        
        System.out.println("\n===== ANIAMLS = CATS ======\n");
        
        Animals polyCat = new Cats("Tabby", "Salmon", "Ball"); // Polymorphism

        System.out.println(polyCat.getName());
        System.out.println(polyCat.getFavFood());
        //System.out.println(polyCat.getFavToy()); // Can't do it

        polyCat.walkAround(); // return walkAround() from Cats
        
        System.out.println(((Cats)polyCat).getFavToy()); // Direct casting
        
        Cats tempCat = (Cats) polyCat;
        System.out.println(tempCat.getFavToy()); // Casting with temp variable
    }
}
