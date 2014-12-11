package poly_coach;

public class PolyMain {

    public static void main(String[] args) {

        INoisable animalObject = new Animal();
        Coach animalCoach = new Coach(animalObject);
        animalCoach.makeSound();
        
        INoisable catObject = new Cat();
        Coach catCoach = new Coach(catObject);
        catCoach.makeSound();
        
        INoisable dogObject = new Dog();
        Coach dogCoach = new Coach(dogObject);
        dogCoach.makeSound();
    }
}