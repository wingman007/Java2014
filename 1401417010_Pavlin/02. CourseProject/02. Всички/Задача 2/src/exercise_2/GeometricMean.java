package exercise_2;

// подусловие е)

public class GeometricMean extends Exercise_2 {
    
    public static void geometricMean() {
        
        double numberArray1 = 0;
        double multipliedArray1 = 1;
        
        for(int i = 0; i < arr1.length; i++) {
            
            if (arr1[i] > 6 && arr1[i] <= 50) {
                
                multipliedArray1*=arr1[i];
                numberArray1++;
            }
        }
        
        double geometricMeanArray1 = Math.pow(multipliedArray1, 1.0 / numberArray1);
        System.out.println("Средно геометричното на елементите на масив arr1, които принадлежат на интервала (6, 50] e: " + geometricMeanArray1);
        
        double numberArray2 = 0;
        double multipliedArray2 = 1;
        
        for(int i = 0; i < arr2.length; i++) {
            
            if (arr2[i] > 6 && arr2[i] <= 50) {
                
                multipliedArray2*=arr2[i];
                numberArray2++;
            }
        }
        
        double geometricMeanArray2 = Math.pow(multipliedArray2, 1.0 / numberArray2);
        System.out.println("Средно геометричното на елементите на масив arr2, които принадлежат на интервала (6, 50] e: " + geometricMeanArray2);

        double numberArray3 = 0;
        double multipliedArray3 = 1;
        
        for(int i = 0; i < arr3.length; i++) {

            if (arr3[i] > 6 && arr3[i] <= 50) {
                
                multipliedArray3*=arr3[i];
                numberArray3++;
            }
        }
            
        double geometricMeanArray3 = Math.pow(multipliedArray3, 1.0 / numberArray3);
        System.out.println("Средно геометричното на елементите на масив arr3, които принадлежат на интервала (6, 50] e: " + geometricMeanArray3);
        
        System.out.println("Произведението на трите средно геометрични е: " + (geometricMeanArray1 * geometricMeanArray2 * geometricMeanArray3));
    }
}
