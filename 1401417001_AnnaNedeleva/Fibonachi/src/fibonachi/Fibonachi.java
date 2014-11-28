/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonachi;

/**
 *
 * @author User
 */
public class Fibonachi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int f,n=7,f1=0, f2=1;
        for (int i=2;i<=n;i++){
            f=f1+f2;
            f1=f2;f2=f;
            System.out.println("i="+i+", f="+f);
        }
    }
        // TODO code application logic here
    }
    
