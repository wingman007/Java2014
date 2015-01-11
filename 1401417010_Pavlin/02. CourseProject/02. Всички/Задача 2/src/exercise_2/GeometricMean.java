package exercise_2;

// подусловие е)

public class GeometricMean extends Exercise_2 {
    
    protected static void geometricMean() {
        
        double numberArray1 = 0;
        double multipliedArray1 = 1;
        
        boolean dividedByZero = false;

        for(int elements : arr1) {
            
            if (elements > 6 && elements <= 50) {

                multipliedArray1 *= elements;
                numberArray1++;
            }
        }
        
        if(numberArray1 == 0) {
            
            dividedByZero = true;
        }
        
        double geometricMeanArray1 = Math.pow(multipliedArray1, 1.0 / numberArray1);
        System.out.println("Средно геометричното на елементите на масив arr1, които принадлежат на интервала (6, 50] e: " + geometricMeanArray1);
        
        double numberArray2 = 0;
        double multipliedArray2 = 1;
        
        for(int elements : arr2) {
            
            if (elements > 6 && elements <= 50) {

                multipliedArray2 *= elements;
                numberArray2++;
            }
        }
        
        if(numberArray2 == 0) {
            
            dividedByZero = true;
        }
        
        double geometricMeanArray2 = Math.pow(multipliedArray2, 1.0 / numberArray2);
        System.out.println("Средно геометричното на елементите на масив arr2, които принадлежат на интервала (6, 50] e: " + geometricMeanArray2);

        double numberArray3 = 0;
        double multipliedArray3 = 1;
        
        for(int elements : arr3) {
            
            if (elements > 6 && elements <= 50) {

                multipliedArray3 *= elements;
                numberArray3++;
            }
        }
        
        if(numberArray3 == 0) {
            
            dividedByZero = true;
        } 
        
        double geometricMeanArray3 = Math.pow(multipliedArray3, 1.0 / numberArray3);
        System.out.println("Средно геометричното на елементите на масив arr3, които принадлежат на интервала (6, 50] e: " + geometricMeanArray3);
        
        if(dividedByZero == false) {
            
            System.out.println("Произведението на трите средно геометрични е: " + (geometricMeanArray1 * geometricMeanArray2 * geometricMeanArray3));
        }      
        
        else {

            System.out.println("В една или повече от стойностите има деление на нула (резултат NaN).");
        }
    }
}
