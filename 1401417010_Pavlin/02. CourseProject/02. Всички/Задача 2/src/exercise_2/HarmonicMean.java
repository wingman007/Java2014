package exercise_2;

// подусловие ж)

public class HarmonicMean extends Exercise_2 {
    
    public static void harmonicMean() {
        
        int numberArray1 = 0;
        double sumArray1 = 0;
        
        for(int i = 0; i < arr1.length; i++) {
            
            if (((arr1[i] > -6 && arr1[i] <= 50) == false) && arr1[i] > 50) { // Harmonic mean cannot be calculated for negative values
                
                sumArray1+=(1.0/arr1[i]);
                numberArray1++;
            }
        }

        System.out.println("Средно хармонично на елементите на масив arr1, които не принадлежат на интервала (-6, 50] e: " + (numberArray1/sumArray1));
        
        int numberArray2 = 0;
        double sumArray2 = 0;
        
        for(int i = 0; i < arr2.length; i++) {
            
            if (((arr2[i] > -6 && arr2[i] <= 50) == false) && arr2[i] > 50) {
                
                sumArray2+=(1.0/arr2[i]);
                numberArray2++;
            }
        }
        
        System.out.println("Средно хармонично на елементите на масив arr2, които не принадлежат на интервала (-6, 50] e: " + (numberArray2/sumArray2));

        int numberArray3 = 0;
        double sumArray3 = 0;
        
        for(int i = 0; i < arr3.length; i++) {

            if (((arr3[i] > -6 && arr3[i] <= 50) == false) && arr3[i] > 50) {      
                
                sumArray3+=(1.0/arr3[i]);
                numberArray3++;
            }
        }
            
        System.out.println("Средно геометричното на елементите на масив arr3, които нр принадлежат на интервала (-6, 50] e: " + (numberArray3/sumArray3));
    }
}
