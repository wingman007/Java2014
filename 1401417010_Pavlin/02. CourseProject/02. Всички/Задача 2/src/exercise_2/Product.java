package exercise_2;

// подусловие б)

public class Product extends Exercise_2 {
    
    public static void product() {
        
        double productArray1 = 1;
        
        for(int i = 0; i < arr1.length; i++) {
            
            if(arr1[i] > 0 && arr1[i]%2 != 0) {
                
                productArray1+= arr1[i];
            }   
        }
        System.out.println("Произведението на ненулевите нечетни елементи на arr1 е: " + productArray1);
        
        double productArray2 = 1;
        
        for(int i = 0; i < arr2.length; i++) {
            
            if(arr2[i] > 0 && arr2[i]%2 != 0) {
                productArray2+= arr2[i];
            }
        }
        System.out.println("Произведението на ненулевите нечетни елементи на arr2 е: " + productArray2);
        
        double productArray3 = 1;
        
        for(int i = 0; i < arr3.length; i++) {
            
            if(arr3[i] > 0 && arr3[i]%2 != 0) {
                productArray3+= arr3[i];
            }
        }
        System.out.println("Произведението на ненулевите нечетни елементи на arr3 е: " + productArray3);
        
        double productArrays = productArray1 * productArray2 * productArray3;
        System.out.printf("Средногеометричното на трите произведения е: %.5f\n", (Math.pow(productArrays, 1.0/3)));
    }
}
