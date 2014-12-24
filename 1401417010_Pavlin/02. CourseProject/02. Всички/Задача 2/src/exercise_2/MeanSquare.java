package exercise_2;

// подусловие д)

public class MeanSquare extends Exercise_2 {
    
    protected static void meanSquare() {
        
        double numberArray1 = 0;
        double sumArray1 = 0;

        for(int elements : arr1) {
            
            sumArray1 += Math.pow(elements, 2);
            numberArray1++;    
        }
        
        double meanSquareArray1 = Math.sqrt(sumArray1/numberArray1);
        System.out.println("Средно квадратичното на елементите на масив arr1 e: " + meanSquareArray1);
        
        double numberArray2 = 0;
        double sumArray2 = 0;
        
        for(int elements : arr2) {
            
            sumArray2 += Math.pow(elements, 2);
            numberArray2++;    
        }
        
        double meanSquareArray2 = Math.sqrt(sumArray2/numberArray2);
        System.out.println("Средно квадратичното на елементите на масив arr2 e: " + meanSquareArray2);

        double numberArray3 = 0;
        double sumArray3 = 0;
        
        for(int elements : arr3) {
            
            sumArray3 += Math.pow(elements, 2);
            numberArray3++;    
        }
        
        double meanSquareArray3 = Math.sqrt(sumArray3/numberArray3);
        System.out.println("Средно квадратичното на елементите на масив arr3 e: " + meanSquareArray3);
        
        System.out.println("Сумата на трите средно квадратични е: " + (meanSquareArray1 + meanSquareArray2 + meanSquareArray3));   
    }
}
