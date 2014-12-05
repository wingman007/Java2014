package laboratory_4;

public class Exercise_2 {

    public static void main(String[] args) {
        String arr[] = {"Ива","Ивелин","Антон","Петър"};

        for(String elements: arr) {
            
            if(elements.contains("и")) {
                System.out.println(elements);
            }            
        }
    }
}
