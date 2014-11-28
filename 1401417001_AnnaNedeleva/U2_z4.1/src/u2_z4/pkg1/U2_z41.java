/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u2_z4.pkg1;

/**
 *
 * @author User
 */
public class U2_z41 {
    
    public static void max(int a1,int a2){
        if (a1>a2)
            System.out.println("Maksimalno ot 2 chisla e "+a1);
        else
            System.out.println("Maksimalno ot 2 chisla e "+a2);
    }
    
    public static void max1(int i1,int i2){
        int max=i1;
        if (max<i2) max=i2;
            System.out.println("Maksimalno ot 2 chisla e " + max);
    }

    public static void max2(int i1,int i2){
        int max = i1 > i2 ? i1 : i2;
        System.out.println("Maksimalno ot 2 chisla e "+max);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int b1=11,b2=30;
        max(b1,b2);
        b1=44;b2=88;
        max1(b1,b2);
        max2(255,255);
        // TODO code application logic here
    }
    
}
