package polymorphism;

public class Dog extends Animal implements INoisable {
    
    @Override
    public void makeNoise() {
        System.out.println("woof");
    }
}
