/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setuniqueid;

/**
 *
 * @author User
 */
public class SetUniqueID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long minNumber = 1;
	long maxNumber = 1000000;
     
        long uniqueID = minNumber + (long)(Math.random() * ((maxNumber - minNumber) + 1));
        System.out.println(uniqueID);
        // TODO code application logic here
    }
    
}
