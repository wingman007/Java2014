package exercise_1_3;

public class Exercise_1_3 {

    public static void main(String[] args) {
        
        Dominos dominos1 = new Dominos(6, 6);

        dominos1.intro();

        Dominos dominos2 = new Dominos(Input.validation(), Input.validation());

        dominos2.intro();

        dominos1.canStitched(dominos2);
    }
}
