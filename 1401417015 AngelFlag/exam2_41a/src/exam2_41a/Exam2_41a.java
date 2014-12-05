/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2_41a;

/**
 *
 * @author THE NET
 */
public class Exam2_41a {
    
        public static void printMax(float number1, float number2){
          
                float max = number1;
                if(number2 > number1) {
            max = number2;
        }
            System.out.println("Max number is:" + max);
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        printMax(2,23);
        printMax(12312,12132);
        printMax(1,22);
        
    }    
}
