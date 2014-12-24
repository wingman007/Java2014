package exercise_2;

// подусловие а)

public class Amount extends Exercise_2 {
    
    public static void amount() {
        
        double sumArray1 = 0;
        
        for(int i = 0; i < arr1.length; i++) {
            
            sumArray1+= arr1[i];
        }
        System.out.println("Сумата на елементите на arr1 е: " + sumArray1);
        
        double sumArray2 = 0;
        
        for(int i = 0; i < arr2.length; i++) {
            
            sumArray2+= arr2[i];
        }
        System.out.println("Сумата на елементите на arr2 е: " + sumArray2);
        
        double sumArray3 = 0;
        
        for(int i = 0; i < arr3.length; i++) {
            
            sumArray3+= arr3[i];
        }
        System.out.println("Сумата на елементите на arr3 е: " + sumArray3);
        
        System.out.printf("Средноаритметичното на трите суми е: %.5f\n", ((sumArray1 + sumArray2 + sumArray3) / 3));
    }
}
