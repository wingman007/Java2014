/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonachi2;

/**
 *
 * @author User
 */
public class Fibonachi2 {

    public static int f(int n){
        if (n <= 2)return 1;
        return f(n-2)+f(n-1);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=10;
        System.out.println(f(n));
        // TODO code application logic here
    }
    
}
