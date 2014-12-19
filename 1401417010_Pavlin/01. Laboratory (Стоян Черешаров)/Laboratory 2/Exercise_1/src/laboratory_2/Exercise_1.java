package laboratory_2;

public class Exercise_1 {

    public static void main(String[] args) {
        
        // Case 1
        System.out.println("Case 1"); 
        
        for(int i = 1; i <=10; i++) {
            
          System.out.println(i);  
        }
        
        // Case 2
        System.out.println("Case 2"); 
        
        int i2 = 1;
        
        while(i2 <= 10) {
        
            System.out.println(i2++);
            //i2++;
            //i2+=1;
        
        }
        
        // Case 3
        System.out.println("Case 3"); 
        
        int i3 = 1;
        
        do {
            System.out.println(i3++);
            //i3+=1;
            //i3++;
        }
        
        while(i3 <= 10) ;
    }
}
