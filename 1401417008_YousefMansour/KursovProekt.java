import java.util.*;

public class KursovProekt {
   static int[] randArr = new int[10];
   static String[] townArr = new String[3];
   static String[] result;
    
  
 
    public static void main(String[] args) {
        generateRandArr();
        System.out.println(Arrays.toString(randArr));
        System.out.println(sum());
               
        fillArr();
        findString();      
    }
    
    //Зад. 4 - а)   
    public static void fillArr(){
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < townArr.length; i++){
            System.out.println("Input name: ");
            townArr[i] = scan.nextLine();
        }
    }
    //Зад. 4 - б)
    public static void findString(){
        System.out.println("Towns with 'grad': ");
        for(int i = 0; i < townArr.length; i++){
            if(townArr[i].contains("grad") || townArr[i].contains("Grad")){
                System.out.println(townArr[i]);         
            }
        }
    }
    
    //Зад. 1
    public static void generateRandArr (){
       Random rand = new Random();
       for(int i = 0; i < 10; i++){
           randArr[i] = rand.nextInt(201) - 100; 
       }
    }
    //Зад. 1 - а)
    public static int sum () {
        int sum  = 0;
        for(int i = 0; i < randArr.length; i++){
            if(Math.abs(randArr[i]) > 30){
                sum += Math.abs(randArr[i]);
            }
        }
        return sum;
    }
}
