/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringarrays;

import java.util.Arrays;

/**
 *
 * @author fmi
 */
public class StringArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // This tells Java to set up a string object with the four characters "B", "i", "l" and another "l". In the Unicode character set, these values are: \u0042, \u0069, \u006c, \u006c. Unicode values are stored as hexadecimals numbers. Capital letters (A to Z) are stored using the values \u0041 to \u005a, while lowercase letters (a to z) are stored using the hexadecimals values \u0061 to \u007a.
        String someText = "Bill";

        String[ ] aryString = new String[5] ;

        aryString[0] = "This";
        aryString[1] = "is";
        aryString[2] = "a";
        aryString[3] = "string";
        aryString[4] = "array";

        Arrays.sort(aryString);

        // We noted that the word "This" comes first. 
        // If the array is supposed to be sorted alphabetically, 
        // however, you would expect the word "a" to come first. 
        // The reason it doesn't is because lowercase "a" 
        // has a hexadecimal value of u\0061, which is the decimal 
        // number 97. But uppercase "T" has a hexadecimal value of u\0054, 
        // which is the decimal number 84. 84 is lower than 97, so the "T" comes first.
        int i;
        for ( i=0; i < aryString.length; i++ ) {
                System.out.println( aryString[i] );
        }        
    }
    
}
