package exercise_2;

// подусловие ж)

public class HarmonicMean extends Exercise_2 {
    
    protected static void harmonicMean() {
        
        double numberArray1 = 0;
        double sumArray1 = 0;

        for(int elements : arr1) {
            
            if (((elements > -6 && elements <= 50) == false) && elements > 0) { // Harmonic mean cannot be calculated for negative values
                
                sumArray1 += (1.0/elements);
                numberArray1++;
            }
        }
        
        System.out.println("Средно хармонично на елементите на масив arr1, които не принадлежат на интервала (-6, 50] e: " + (numberArray1/sumArray1));
        
        double numberArray2 = 0;
        double sumArray2 = 0;
        
        for(int elements : arr2) {
            
            if (((elements > -6 && elements <= 50) == false) && elements > 0) {
                
                sumArray2 += (1.0/elements);
                numberArray2++;
            }
        }
        
        System.out.println("Средно хармонично на елементите на масив arr2, които не принадлежат на интервала (-6, 50] e: " + (numberArray2/sumArray2));

        double numberArray3 = 0;
        double sumArray3 = 0;
        
        for(int elements : arr3) {
            
            if (((elements > -6 && elements <= 50) == false) && elements > 0) {
                
                sumArray3 += (1.0/elements);
                numberArray3++;
            }
        }
        
        System.out.println("Средно геометричното на елементите на масив arr3, които не принадлежат на интервала (-6, 50] e: " + (numberArray3/sumArray3));
    }
}
