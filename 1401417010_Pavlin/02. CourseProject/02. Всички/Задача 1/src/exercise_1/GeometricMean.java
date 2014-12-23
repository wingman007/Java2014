package exercise_1;

// подточка е)

public class GeometricMean extends Exercise_1 {

    public static void geometricMean() {
        
        int number = 0;
        int multiplied = 1;
        
        for(int elements : arr) {
            if (elements > 6 && elements <= 50) {

                number++;
                multiplied = multiplied * elements;
            }
        }
        
        switch (number) {
            case 0: 
                System.out.print("\nНяма числа, които принадлежат на интервала (6, 50]!");
                break;
            case 1:  
                System.out.printf("\nБрой: " + number + " Няма средно геометрично.");
                break;
            default:
                System.out.printf("\nБрой: " + number + " Средно геометрично е : %.5f", Math.pow(multiplied, 1.0 / number));
               break;
        }
    }
}
