package poly_coach;

class Cat extends Animal implements INoisable {
    
    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }
}
