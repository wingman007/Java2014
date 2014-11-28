/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u3_z1;

/**
 *
 * @author User
 */
public class U3_z1 {
    
    public static int max(int i1, int i2){
        return i1>i2?i1:i2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i1 = Integer.parseInt(args[0]);
        int i2 = Integer.parseInt(args[1]);
        System.out.println(max(i1, i2));
        // TODO code application logic here
    }
    
}
