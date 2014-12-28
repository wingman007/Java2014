package exercise_1_4;

public class Exercise_1_4 {

    public static void main(String[] args) {
              
        Movies movie1 = new Movies("A Walk Among the Tombstones", "HBO", 20, 22);
        movie1.program();
        
        Movies movie2 = new Movies(Input.validationTitle(), Input.validationTv(), Input.validationStartHour(), Input.validationEndHour());
        movie2.program();
        
        // 1 начин
        movie1.isWatchable(movie2);
        
        // 2 начин
        Watchable movies = new Watchable();
        movies.isWatchable(movie1, movie2);
    }
}
