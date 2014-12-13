package laboratory_4;

public class Exercise_1 {

    public static void main(String[] args) {
        String arr[] = {"Ива","Ивелин","Марин","Георги"};

        for(String elements: arr) {
            
            if(elements.startsWith("Ив")) {
                System.out.println(elements);
            }            
        }
    }
}