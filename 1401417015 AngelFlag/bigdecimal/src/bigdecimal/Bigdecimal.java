/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigdecimal;

/**
 *
 * @author THE NET
 */
import java.math.BigDecimal; 
public class Bigdecimal {
    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
    double sum = 0.0d;
                BigDecimal bdValue = new BigDecimal("0.1");
                BigDecimal bdSum = new BigDecimal("0.0");
        for(int i=1; i<=10; i++) {
            sum += 0.1d;
            bdSum = bdSum.add(bdValue);
}
            System.out.println("Double sum is: " + sum);
            System.out.println("BigDecimal sum is: " + bdSum);
  
        }
}
