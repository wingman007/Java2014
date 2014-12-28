package exercise_1_4;

public class Watchable {

    protected void isWatchable(Movies movie1, Movies movie2) {
        
        if(movie1.getEndHour() <= movie2.getStartHour() || movie1.getStartHour() >= movie2.getEndHour()) {
            
            System.out.println("\"" + movie1.getTitle() + "\" и \"" + movie2.getTitle() + "\" НЕ СЕ пресират по време.\n");
        }
        
        else {
            
            System.out.println("\"" + movie1.getTitle() + "\" и \"" + movie2.getTitle() + "\" СЕ пресират по време.\n");
        }
    }
}
