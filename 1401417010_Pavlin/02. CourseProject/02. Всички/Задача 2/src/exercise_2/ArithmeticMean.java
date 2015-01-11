package exercise_2;

// подусловие г)

public class ArithmeticMean extends Exercise_2 {
    
    protected static void arithmeticMean() {
        
        double numberArray1 = 0;
        double sumArray1 = 0;
        
        boolean dividedByZero = false;
        
        for(int elements : arr1){
            
            if(elements % 5 == 0) {

                sumArray1 += elements;
                numberArray1++;
            } 
        }
        
        if(numberArray1 == 0) {
            
            dividedByZero = true;
        }
        
        double arithmeticMeanArray1 = sumArray1/numberArray1;
        System.out.println("Средно аритметичното на елементите на всеки масив arr1, които се делят на 5 без остатък е: " + arithmeticMeanArray1);
            
        double numberArray2 = 0;
        double sumArray2 = 0;
        
        for(int elements : arr2){
            
            if(elements % 5 == 0) {

                sumArray2 += elements;
                numberArray2++;
            } 
        }
        
        if(numberArray2 == 0) {
            
            dividedByZero = true;
        }
        
        double arithmeticMeanArray2 = sumArray2/numberArray2;
        System.out.println("Средно аритметичното на елементите на всеки масив arr2, които се делят на 5 без остатък е: " + arithmeticMeanArray2);

        double numberArray3 = 0;
        double sumArray3 = 0;
        
        for(int elements : arr3){
            
            if(elements % 5 == 0) {

                sumArray3 += elements;
                numberArray3++;
            } 
        }
            
        if(numberArray3 == 0) {
            
            dividedByZero = true;
        }
        
        double arithmeticMeanArray3 = sumArray3/numberArray3;
        System.out.println("Средно аритметичното на елементите на всеки масив arr3, които се делят на 5 без остатък е: " + arithmeticMeanArray3);
            
        if(dividedByZero == false) {
            
            double arithmeticMeanMin = arithmeticMeanArray1 < arithmeticMeanArray2 ? arithmeticMeanArray1 : arithmeticMeanArray2;
            System.out.println("Минималното от трите средно аритметични;: " + (arithmeticMeanMin < arithmeticMeanArray3 ? arithmeticMeanMin : arithmeticMeanArray3));
        }
        
        else {
            
            System.out.println("В една или повече от стойностите има деление на нула (резултат NaN).");
        }
    }
}
