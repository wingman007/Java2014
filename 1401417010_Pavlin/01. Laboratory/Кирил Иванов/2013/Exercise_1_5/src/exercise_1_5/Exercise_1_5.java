package exercise_1_5;

public class Exercise_1_5 {

    public static void main(String[] args) {
        
        Chairs chair1 = new Chairs("LINCOLN", 1, 5);
        
        Chairs chair2 = new Chairs(Input.validationМodel(), Input.validationMinHeight(), Input.validationMaxHeight());
        
        // начин 1
        chair1.intervalHeight(chair2);
        
        // начин 2
        IntervalHeight chairs = new IntervalHeight();
        chairs.intervalHeight(chair1, chair2);
    }
}
