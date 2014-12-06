package laboratory_2;

public class Exercise_4_2 {

    public static void main(String[] args) {
        
        int returnNumber = maxNumber(3,17);
        System.out.println(returnNumber);
        
        System.out.println(maxNumber(32,1));
    }
    
    public static int maxNumber(int par1, int par2) {
    
        return par1 > par2 ? par1 : par2;
    }
}
