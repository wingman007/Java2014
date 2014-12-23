package geometric_mean;

import static java.lang.Math.pow;

public class GeometricMean {

    public static void main(String[] args) {
        
        int[] arr = new int[10];
        
        int br = 0;
        int multiplied = 1;
        
        for (int elements : arr) {
            
            elements = randomWithRange(-100, 100);
            System.out.print("|" + elements + "|");
            
            if (elements > 6 && elements <= 50) {
                
                br++;
                multiplied = multiplied * elements;
            }
        }
        
        averageGeometrically(br, multiplied);
    }
    
    private static int randomWithRange(int min, int max) {
        
        return (int)(Math.random() * (max - min + 1) + min);
    }
    
    private static void averageGeometrically(int br, int multiplied) {

        switch (br) {
            case 0: 
                System.out.println("\nНяма числа, които принадлежат на интервала (6, 50]!");
                break;
            case 1:  
                System.out.printf("\nБрой: " + br + " [" + multiplied +"] Няма средно геометрично.\n");
                break;
            default:
                System.out.printf("\nБрой: " + br + " Средно геометрично: %.5f\n", pow(multiplied, 1.0 / br));
               break;
        }
    }
}
