package coach;

public class CoachMain {

    public static void main(String[] args) {

        INoisable animal = new Animal();
        animal.makeNoise();
        
        INoisable cat = new Cat();
        cat.makeNoise();
        
        INoisable dog = new Dog();
        dog.makeNoise();
    }
}
