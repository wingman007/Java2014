package exercise_11;

import java.util.Scanner;

public class Exercise_11 {

    public static void main(String[] args) {

        double a,b,c,d; 

        Scanner input = new Scanner(System.in);

        System.out.print("Enter something for a: ");
        a = input.nextDouble();


        System.out.print("Enter something for b: ");
        b = input.nextDouble();


        System.out.print("Enter something for c: ");
        c = input.nextDouble();


        System.out.print("Enter something for d: ");
        d = input.nextDouble();


        f(a, d);
        f(b, c);
            
    }
    
    public static void f(double par1, double par2) {

        //System.out.println(par1*par1 + 2*(par1-par2*par2)+7*par2);
        System.out.println(par1+par2);
    }
}