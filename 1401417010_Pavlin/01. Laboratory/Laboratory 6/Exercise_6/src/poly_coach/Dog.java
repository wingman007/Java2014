package poly_coach;

class Dog extends Animal implements INoisable {

    public Dog(String name) {
        super(name);
    }
    
    @Override
    public void makeNoise() {
        System.out.println("I am a " + getName() + " and I make Woof");
    }
}
