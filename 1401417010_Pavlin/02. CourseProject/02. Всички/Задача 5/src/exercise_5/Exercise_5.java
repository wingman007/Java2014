package exercise_5;

public class Exercise_5 {

    public static void main(String[] args) {
        
        String ID1 = "9004014745";
        String ID2 = "9101133344";
        
        int intID1 = Integer.parseInt(ID1.substring(0, 2));
        int intID2 = Integer.parseInt(ID2.substring(0, 2));
        
        System.out.println("По-младият е: " + (intID1 > intID2 ? ID1 : ID2));
    }
}
