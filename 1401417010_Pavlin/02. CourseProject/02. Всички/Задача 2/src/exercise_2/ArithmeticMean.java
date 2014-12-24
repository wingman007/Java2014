package exercise_2;

// подусловие г)

public class ArithmeticMean extends Exercise_2 {
    
    public static void arithmeticMean() {
        
        double numberArray1 = 0;
        double sumArray1 = 0;
        
        for(int i = 0; i < arr1.length; i++) {
            
            if(arr1[i]%5 == 0) {
                
                sumArray1+=arr1[i];
                
                numberArray1++;
            }   
        }
        
        double arithmeticMeanArray1 = sumArray1/numberArray1;
        System.out.println("Средно аритметичното на елементите на всеки масив arr1, които се делят на 5 без остатък е: " + arithmeticMeanArray1);
        
        double numberArray2 = 0;
        double sumArray2 = 0;
        
        for(int i = 0; i < arr2.length; i++) {
            
            if(arr2[i]%5 == 0) {
                
                sumArray2+=arr2[i];
                
                numberArray2++;
            }   
        }
        
        double arithmeticMeanArray2 = sumArray2/numberArray2;
        System.out.println("Средно аритметичното на елементите на всеки масив arr2, които се делят на 5 без остатък е: " + arithmeticMeanArray2);

        double numberArray3 = 0;
        double sumArray3 = 0;
        
        for(int i = 0; i < arr3.length; i++) {
            
            if(arr3[i]%5 == 0) {
                
                sumArray3+=arr3[i];
                
                numberArray3++;
            }   
        }
            
        double arithmeticMeanArray3 = sumArray3/numberArray3;
        System.out.println("Средно аритметичното на елементите на всеки масив arr1, които се делят на 5 без остатък е: " + arithmeticMeanArray3);
        
        double arithmeticMeanMin = arithmeticMeanArray1 < arithmeticMeanArray2 ? arithmeticMeanArray1 : arithmeticMeanArray2;
        System.out.println("Минималното от трите средно аритметични;: " + (arithmeticMeanMin < arithmeticMeanArray3 ? arithmeticMeanMin : arithmeticMeanArray3));
    }
}
