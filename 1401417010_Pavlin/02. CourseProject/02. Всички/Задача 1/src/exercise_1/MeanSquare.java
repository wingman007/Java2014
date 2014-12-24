package exercise_1;

// подточка д)

public class MeanSquare extends Exercise_1 {
    
    protected static void meanSquare() {
        
        int number = 0;
        int sum = 0;
        
        for(int i = 0; i < arr.length; i+= 3) {
             
            sum += Math.pow(arr[i], 2);
            number++;
        }
        
        if(number == 0) {
            
            System.out.print("\nНяма такива елементи.");
        }
        
        else {
            System.out.print("\nСредно квадратично на елементите, чиито пореден номер се дели на 3 без остатък е: " + Math.sqrt(sum/number)); 
        }
    }
}
