package exercise_6;

public class Exercise_6 {

    public static void main(String[] args) {

    }
    
    static int find_b(int x, int[] arr) {
        
        int left = 0;
        int right = arr.length - 1;
        int middle;
        
        do {
            middle = (left + right) / 2;
            if (arr[middle] < x) {
                left = middle + 1;
            }
            
            else {
                right = middle - 1;
            }
        } 
        
        while (arr[middle] != x && right >= left);
        
        if (arr[middle] == x) {
            return middle;
        }
        
        else {
            return -1;
        }
    }
}
