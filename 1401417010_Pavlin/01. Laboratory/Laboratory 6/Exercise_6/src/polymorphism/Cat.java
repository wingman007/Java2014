package polymorphism;

public class Cat extends Animal implements INoisable {
    
    @Override
    public void makeNoise() {
        System.out.println("meow");
    }
}
