package laboratory_4;

public class Exercise_6 {

    public static void main(String[] args) {
        
        int[] arr = {1, 22, 33, 44, 55, 66, 77, 88, 99};
        
        // Брой на извършени действия - до достигане на индекса на числото - 7
        System.out.println("Числото 77 е намерено " + linearSearchAlgorithm(77, arr));
        
        // Брой на извършени действия - до края на масива - 9
        System.out.println("Числото 78 е намерено " + linearSearchAlgorithm(78, arr));
        
        System.out.println("---------------------------");
        
        // Брой на извършени действия - сравняване на ядрото, цепене на дясната част и намиране на стойността - 3
        System.out.println("Числото 77 е в позиция " + binarySearchAlgorithm(77, arr));
        
        // Брой на извършени действия - сравняване на ядрото, цепене на дясната част, подминаване на стойността и връщане на -1 - 4
        System.out.println("Числото 78 е в позиция " + binarySearchAlgorithm(78, arr));
    }
    
    static boolean linearSearchAlgorithm(int x, int[] arr) {
        
        for(int elements : arr) {
            
            if(elements == x) {
                
                return true;
            }
        }
        
        return false;
    }
    
    static int binarySearchAlgorithm(int x, int[] arr) {
        
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