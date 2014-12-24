package exercise_1;

// подточка в)

public class EvenIndex extends Exercise_1 {
      
    protected static void evenIndex() {
        
        int number = 0;
        
        for(int i = 0; i < arr.length; i+= 2) {
            
            if(arr[i] >= -30 && arr[i] <= 30) {

                number++;
            }
        }
        System.out.print("\nБроят на елементите с четен индекс, които са в интервала [–30,30] е: " + number);
    }
}
