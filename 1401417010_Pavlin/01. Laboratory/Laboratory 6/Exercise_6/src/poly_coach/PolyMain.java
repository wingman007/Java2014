package poly_coach;

public class PolyMain {

    public static void main(String[] args) {

        INoisable animalObject = new Animal("Animal");
        INoisable catObject = new Cat("Cat");
        INoisable dogObject = new Dog("Dog");

        Coach coach = new Coach(animalObject);
        coach.makeSound();
        
        coach.setTrain(catObject);
        coach.makeSound();
        
        coach.setTrain(dogObject);
        coach.makeSound();  
    }
}