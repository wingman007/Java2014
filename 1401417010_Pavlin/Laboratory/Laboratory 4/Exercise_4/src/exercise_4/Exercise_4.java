package exercise_4;

import java.util.regex.Pattern; 

public class Exercise_4 {

    public static void main(String[] args) {

        String arr[] = {"ИВА", "Ивелин", "СТОЯН", "Марин","Георги", "диМитър"};
        
        // Ако всички букви са големи
        for(String elements: arr) {
            if(elements.matches("[А-Я]*")) {
                System.out.println(elements + " - Ако всички букви са големи");
            } 
        }
        
        System.out.println("---------------------------------");
        
        // Ако първата буква е голяма
        for(String elements: arr) {

            if (Pattern.compile("^[А-Я]").matcher(elements).find() == true) {
                System.out.println(elements + " - Ако първата буква е голяма");
            }
        }
        
        System.out.println("---------------------------------");
        
        //Ако някоя от буквите е голяма
        for(String elements: arr) {

            if (Pattern.compile("[А-Я]").matcher(elements).find() == true) {
                System.out.println(elements + " - Ако някоя от буквите е голяма");
            } 
        }   
    }
}
