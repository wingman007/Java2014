package laboratory_4;

public class Exercise_7 {

    public static void main(String[] args) {

        for(int i = 0; i<3; i++){
            int[] arr = populateArray();
            quadAvr(arr);   
        }
    }
    
    public static int[] populateArray() {
        
        int count = randomWithRange(1, 20);

        int[] arr = new int[count];
        
        for(int val = 0 ; val < count; val++) {
            
            arr[val] = randomWithRange(-100, 100); 
        }

        return arr;
    }

    public static int randomWithRange(int min, int max) {
        
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void quadAvr(int[] arr) {

        double sum = 0;
        double count = 0;
        
        for (int elements : arr) {
            
            System.out.print("| " + elements + " |");
            
            if (elements >= -20 && elements <= 20) {
                
                sum += Math.pow(elements, 2);
                count++;
            }
        }
        
        double result = sum / count;
        
        if (count == 0) {
            System.out.println("\nНяма числа в интервал [-20, 20] \n");
        }
        
        else {
            System.out.printf("\nСредно квадратично на числата, които са в интервал [-20, 20]: %.3f \n\n", result);
        }
    }
}
