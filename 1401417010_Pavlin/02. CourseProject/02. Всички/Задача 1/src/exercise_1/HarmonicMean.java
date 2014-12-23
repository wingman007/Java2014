package exercise_1;

// подточка ж)

public class HarmonicMean extends Exercise_1 {
    
    public static void harmonicMean() {
        
        double sum = 0;
        int number = 0;
        
        for(double elements : arr) {
            
            if (elements > -6 && elements <= 50 && elements != 0.0) {
                sum += (1/elements);
                number++;
            }
        }
        
        switch (number) {
            case 0: 
                System.out.print("\nНяма числа, които принадлежат на интервала (-6, 50]!");
                break;
            case 1:  
                System.out.printf("\nБрой: " + number + " Няма средно хармонично.");            
                break;
            default:
                System.out.printf("\nСредно хармонично е: %.5f", (number/sum));
               break;
        }
    }
}
