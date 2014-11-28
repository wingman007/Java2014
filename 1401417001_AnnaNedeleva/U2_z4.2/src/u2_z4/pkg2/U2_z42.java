/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u2_z4.pkg2;

/**
 *
 * @author User
 */
public class U2_z42 {
    
    public static int max(int i1,int i2){
        int max=i1>i2?i1:i2;
        return max;
        // return max=i1>i2?i1:i2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int max=max(33,90);
        System.out.println(max);
        System.out.println(max(80,77));
        // TODO code application logic here
    }
    
}
