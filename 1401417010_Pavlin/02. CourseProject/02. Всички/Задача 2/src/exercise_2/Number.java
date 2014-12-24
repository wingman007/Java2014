package exercise_2;

// подусловие в)

public class Number extends Exercise_2 {
    
    protected static void number() {
        
        int numberArray1 = 0;
        
        for(int i = 0; i < arr1.length; i+=2) {
            
            if(arr1[i] >= -30 && arr1[i] <= 30) {
                
                numberArray1++;
            }   
        }
        
        System.out.println("Броят на елементите на масив arr1, които са с четен индекс и принадлежат на интервала [–30,30] е: " + numberArray1);
        
        int numberArray2 = 0;
        
        for(int i = 0; i < arr2.length; i+=2) {
            
            if(arr2[i] >= -30 && arr2[i] <= 30) {
                
                numberArray2++;
            }
        }
        
        System.out.println("Броят на елементите на масив arr2, които са с четен индекс и принадлежат на интервала [–30,30] е: " + numberArray2);
        
        int numberArray3 = 0;
        
        for(int i = 0; i < arr3.length; i+=2) {
            
            if(arr3[i] >= -30 && arr3[i] <= 30) {
                
                numberArray3++;
            }
        }
        
        System.out.println("Броят на елементите на масив arr3, които са с четен индекс и принадлежат на интервала [–30,30] е: " + numberArray3);
        
        int numberMax = numberArray1 > numberArray2 ? numberArray1 : numberArray2;
        
        System.out.println("Максималния от трите броя e: " + (numberMax > numberArray3 ? numberMax : numberArray3));
    }
}
