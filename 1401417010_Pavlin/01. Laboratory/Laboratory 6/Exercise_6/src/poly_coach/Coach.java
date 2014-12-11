package poly_coach;

public class Coach {
    
    private final INoisable train;

    public Coach(INoisable object) {
        
        train = object;
    }
    
    public void makeSound() {
        
        train.makeNoise();
    }
}
