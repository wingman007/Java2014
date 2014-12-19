package laboratory_4;

public class Exercise_4 {

    public static void main(String[] args) {

        String arr[] = {"ИВА", "Ивелин", "СТОЯН", "Марин","Георги", "диМитър"};
        
        for(String elements: arr) {
            if(elements.matches("[А-Я]*")) {
                System.out.println(elements + " - Ако всички букви са големи");
            } 
        }
    }
}
