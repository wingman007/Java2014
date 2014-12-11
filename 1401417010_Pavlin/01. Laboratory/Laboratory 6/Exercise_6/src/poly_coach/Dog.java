package poly_coach;

class Dog extends Animal implements INoisable {
    
    @Override
    public void makeNoise() {
        System.out.println("Woof");
    }
}
