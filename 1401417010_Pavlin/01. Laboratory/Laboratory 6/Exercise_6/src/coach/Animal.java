package coach;

class Animal implements INoisable {
    
    @Override
    public void makeNoise() {
        System.out.println("Grr");
    } 
}
