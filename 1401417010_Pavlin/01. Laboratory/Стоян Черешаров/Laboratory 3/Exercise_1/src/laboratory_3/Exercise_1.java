package laboratory_3;

public class Exercise_1 {

    public static void main(String[] args) {

        int args1 = Integer.parseInt(args[0]); //13
        int args2 = Integer.parseInt(args[1]); //23
        
        System.out.println(max(args1,args2));
    }
    
    public static int max(int par1, int par2) {
    
        //return par1 > par2 ? par1 : par2;
        return Math.max(par1, par2);
    }
}
