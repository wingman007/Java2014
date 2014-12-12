package poly_coach;

class Cat extends Animal implements INoisable {

    public Cat(String name) {
        super(name);
    }
    
    @Override
    public void makeNoise() {
        System.out.println("I am a " + getName() + " and I make Meow");
    }
}
