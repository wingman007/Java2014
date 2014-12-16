package geometric_mean;

import static java.lang.Math.pow;

public class GeometricMean {

    public static void main(String[] args) {
        
        int[] arr = new int[5];
        
        int br = 0;
        double multiplied = 1.0;
        
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
    
    public static int randomWithRange(int min, int max) {
        
        return (int)(Math.random() * (max - min + 1) + min);
    }
    
    public static void averageGeometrically(int br, double multiplied) {
        
        if (br != 0) {
            System.out.printf("\nБрой: " + br + " Средно геометрично: %.5f\n", pow(multiplied, 1.0 / br));
        }
        
        else {
            System.out.println("\nНяма числа, които принадлежат на интервала (6, 50]!");
        }
    }
}
