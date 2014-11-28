/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u2_z11;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class U2_z11 {
    
        public static void nared(int arr[]){
            for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        }
        
        public static void obrat(int arr[]){
            for (int i=(arr.length-1);i>=0;i--)
            System.out.print(arr[i]+" ");
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Въведете броя на елементите на масива");
        int n=input.nextInt();
        int arr[]=new int[n];
               
        for (int i=0;i<n;i++){
            System.out.println("Въведете "+i+"-й елемент на масива");
            arr[i]=input.nextInt();
        }
        input.close();
        nared(arr);
        System.out.println();
        obrat(arr);
        // TODO code application logic here
    }
    
}
