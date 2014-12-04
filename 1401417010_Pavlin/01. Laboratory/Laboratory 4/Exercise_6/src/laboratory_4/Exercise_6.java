package laboratory_4;

public class Exercise_6 {

    public static void main(String[] args) {
        
    }
    
    static int heuristicAlgorithm(int x, int[] arr) {
        
        int core;
        int left = 0;
        int right = arr.length - 1;

        do {
            core = (left + right) / 2;
            
            if (arr[core] < x) {
                left = core + 1;
            }
            
            else {
                right = core - 1;
            }
        } 
        
        while (arr[core] != x && right >= left);
        
        if (arr[core] == x) {
            return core;
        }
        
        else {
            return -1;
        }
    }
}