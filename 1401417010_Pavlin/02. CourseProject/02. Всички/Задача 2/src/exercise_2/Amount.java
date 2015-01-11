package exercise_2;

// подусловие а)

public class Amount extends Exercise_2 {
    
    protected static void amount() {
        
        double sumArray1 = 0;
        
        for(int elements : arr1) {
            
            sumArray1 += elements;
        }
        
        System.out.println("Сумата на елементите на arr1 е: " + sumArray1);
        
        
        double sumArray2 = 0;
        
        for(int elements : arr2) {
            
            sumArray2 += elements;
        }
        
        System.out.println("Сумата на елементите на arr2 е: " + sumArray2);
        
        
        double sumArray3 = 0;
        
        for(int elements : arr3) {
            
            sumArray3 += elements;
        }
        
        System.out.println("Сумата на елементите на arr3 е: " + sumArray3);
        
        
        System.out.printf("Средноаритметичното на трите суми е: %.5f\n", ((sumArray1 + sumArray2 + sumArray3) / 3));
    }
}
