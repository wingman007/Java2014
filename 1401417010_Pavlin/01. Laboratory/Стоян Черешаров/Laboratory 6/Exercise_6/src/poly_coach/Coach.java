package poly_coach;

public class Coach {
    
    private INoisable train;
    
    public INoisable getTrain() {
        return train;
    }
    
    public final void setTrain(INoisable train) {
        this.train = train;   
    }
    
    public Coach(INoisable object) {
        setTrain(object);
    }
    
    public void makeSound() {
        
        train.makeNoise();
    }
}
