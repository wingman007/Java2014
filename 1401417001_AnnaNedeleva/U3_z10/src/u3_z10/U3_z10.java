/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u3_z10;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class U3_z10 {
    
    static int arrLength(int n){
        int l=0;
     while (n!=0)
        {
            n=n/2;
            l=l+1;
        }   
     return l;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer number \"n\" ");
        int n10= input.nextInt();
        int l=arrLength(n10);
            
              
        
        System.out.println("l="+l);
        
        int []arr=new int[l];
        int o;
        for (int i=0;i<l;i++){
            o=n10%2;
            System.out.println(o);
            arr[i]=n10%2;
            n10=n10/2;
        }    
        for (int i=l-1;i>=0;i--){
        System.out.print(arr[i]);
        }
    }
    
}
