package exercise_2;

// подусловие б)

public class Product extends Exercise_2 {
    
    protected static void product() {
        
        double productArray1 = 1;
        
        for(int elements : arr1) {
            
            if(elements > 0 && elements % 2 != 0) { // Средногеометрично не може да се смята с отрицателни числа
                
                productArray1 += elements;
            }    
        }
        
        if (productArray1 == 1) {
            
            System.out.println("В arr1 няма нечетни елементи.");
        }
        
        else {
            System.out.println("Произведението на ненулевите нечетни елементи на arr3 е: " + productArray1);
        }
        
        double productArray2 = 1;
        
        for(int elements : arr2) {
            
            if(elements > 0 && elements % 2 != 0) {
                
                productArray2 += elements;
            }
        }
        
        if (productArray2 == 1) {
            
            System.out.println("В arr2 няма нечетни елементи.");
        }
        
        else {
            System.out.println("Произведението на ненулевите нечетни елементи на arr3 е: " + productArray2);
        }
        
        double productArray3 = 1;
        
        for(int elements : arr3) {
            
            if(elements > 0 && elements % 2 != 0) {
                
                productArray3 += elements;
            }
        }
        
        if (productArray3 == 1) {
            
            System.out.println("В arr3 няма нечетни елементи.");
        }
        
        else {
            System.out.println("Произведението на ненулевите нечетни елементи на arr3 е: " + productArray3);
        }
        
        System.out.printf("Средногеометричното на трите произведения е: %.5f\n", (Math.pow((productArray1 * productArray2 * productArray3), 1.0/3)));
    }
}
