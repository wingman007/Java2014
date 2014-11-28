 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u2_z9;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class U2_z9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Въведете номер на месец: ");
        Scanner s= new Scanner(System.in);
        String text;
        
        int izbor = s.nextInt();
        switch(izbor){
            case 1: text = "Януари";break;
            case 2: text = "Февруари";break;
            case 3: text = "Март";break;
            case 4: text = "Април";break;
            case 5: text = "Май";break;
            case 6: text = "Юни";break;
            case 7: text = "Юли";break;
            case 8: text = "Август";break; 
            case 9: text = "Септември";break;
            case 10: text = "Октомври";break;
            case 11: text = "Ноември";break;
            case 12: text = "Декември";break;
            default: text = "Въведен грешен номер на месец";break;
        }
        System.out.println(text);
        s.close();
        // TODO code application logic here
    }
    
}
