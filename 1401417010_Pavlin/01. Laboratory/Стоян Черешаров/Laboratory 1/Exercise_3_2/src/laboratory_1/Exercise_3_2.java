package laboratory_1;

public class Exercise_3_2 {

    public static void main(String[] args) {
        double a, b;
        a = 4;
        b = 8;

        second(a, b);
        System.out.println("---------------------------");
        second(b, a);
        System.out.println("---------------------------");
        second(3, 6);
        System.out.println("---------------------------");
    }
    
    public static void second(double par1, double par2) {
        
        System.out.println("a + b = " + par1 + " + " + par2 + " = " + (par1 + par2));
        System.out.println("a - b = " + par1 + " - " + par2 + " = " + (par1 - par2));
        System.out.println("a * b = " + par1 + " * " + par2 + " = " + (par1 * par2));
        System.out.println("a / b = " + par1 + " / " + par2 + " = " + (par1 / par2));   
    }
}

