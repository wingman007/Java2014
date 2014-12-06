package laboratory_2;

public class Exercise_4_1 {

    public static void main(String[] args) {

        maxNumber(3,6);
        maxNumber(8,17);
        maxNumber(82,14);
        
        maxNumber2(3,6);
        maxNumber2(8,17);
        maxNumber2(82,14);
    }
    
    public static void maxNumber(int par1, int par2) {
        
        int max = par1;
        
        if(par1 < par2) {
            max = par2;
        }
        
        System.out.println(max);  
    }
    
    public static void maxNumber2(int par1, int par2) {
        
        int max2 = par1 > par2 ? par1 : par2;
        System.out.println("Тернарен (троен) оператор " + max2);  
    }
}
