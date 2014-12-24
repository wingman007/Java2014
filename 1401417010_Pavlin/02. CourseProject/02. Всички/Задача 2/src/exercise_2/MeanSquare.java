package exercise_2;

// подусловие д)

public class MeanSquare extends Exercise_2 {
    
    public static void meanSquare() {
        
        double numberArray1 = 0;
        double sumArray1 = 0;
        
        for(int i = 0; i < arr1.length; i++) {

            sumArray1+=Math.pow(arr1[i], 2);
            numberArray1++;   
        }
        
        double meanSquareArray1 = Math.sqrt(sumArray1/numberArray1);
        System.out.println("Средно квадратичното на елементите на масив arr1 e: " + meanSquareArray1);
        
        double numberArray2 = 0;
        double sumArray2 = 0;
        
        for(int i = 0; i < arr2.length; i++) {
            
            sumArray2+=Math.pow(arr2[i], 2);
            numberArray2++;  
        }
        
        double meanSquareArray2 = Math.sqrt(sumArray2/numberArray2);
        System.out.println("Средно квадратичното на елементите на масив arr2 e: " + meanSquareArray2);

        double numberArray3 = 0;
        double sumArray3 = 0;
        
        for(int i = 0; i < arr3.length; i++) {

            sumArray3+=Math.pow(arr3[i], 2);
            numberArray3++;  
        }
            
        double meanSquareArray3 = Math.sqrt(sumArray3/numberArray3);
        System.out.println("Средно квадратичното на елементите на масив arr3 e: " + meanSquareArray3);
        
        System.out.println("Сумата на трите средно квадратични е: " + (meanSquareArray1 + meanSquareArray2 + meanSquareArray3));
    }
}
