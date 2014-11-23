/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringmanipulation;

/**
 *
 * @author fmi
 */
public class StringManipulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        // TODO code application logic here
        String changeCase = "Text to Change";
        System.out.println(changeCase);
        // immutable we produce new strings we don't change the existing 
        String result;
        result  = changeCase.toUpperCase();
        System.out.println(result);

        System.out.println( result.toLowerCase( ) );  
        */
        /*
        int result;
        String word1 = "Ape";
        String word2 = "App";
		
	result = word1.compareTo(word2);
		
        if (result < 0) {
                System.out.println("word1 is less than word2");
        }
        else if (result > 0) {
                System.out.println("word1 is more than word2");
        }
        else if ( result == 0) {
                System.out.println("the same words");
        }
        */
        /*
        // indexOf
        // String ampersand = ".com"; // '@'; // or use a string
        char ampersand = '@';
        String email = "stoyan@hotmail.com";
        int result = email.indexOf(ampersand);

        if (result == -1) {
                System.out.println("@ is missing in the string");
        }
        else {
                System.out.println("email is OK result = " + result);
        }
        // start position
        int startPosition = 7;
        result = email.indexOf(ampersand, startPosition);
         System.out.println("start position result = " + result);
        
         
        //
        String dotcom = ".com";
        Boolean ending = email.endsWith( dotcom );

        if (ending == false ) {
        System.out.println( "Invalid Email Address" );
        }
        else {
        System.out.println( "Email Address OK endsWith .com" );
        }

        Boolean startVal = email.startsWith( dotcom );
        
        */
        /*
        // Substring
        String FullName = "Bill Gates";
        String FirstNameChars = "";
        // This means start grabbing characters at position 0 in the string, eans the position in the string that you want to end at
        FirstNameChars = FullName.substring( 0, 2 );

        System.out.println( FirstNameChars );
        
        // Now, Java will start at character two in the string FirstName, and then grab the characters from position 2 right to the end of the string.
        String test = FullName.substring( 2 );
        System.out.println( test );
         */
        /*
        // !!!!!!    == !=  DON'T DO IT
        // You can check two strings to see if they are the same. For this, use the equals method in Java. 
        String email1 = "stoyan@hotmail.com";
        String email2 = "stoyan@hotmail.com";
        Boolean isMatch = false;

        isMatch = email1.equals(email2);
        
        System.out.println( isMatch );
        */
        /*
        String email = "meme@me.com";

        char aChar = email.charAt( 4 );
        System.out.println( aChar );
        */
        /*
        // replaces strings or chars
	String aString = "Did you take you,books";
	String correct = aString.replace("you", "your");
	// aString.replace( '?', '@' )
        System.out.println( correct ); 
        
        
        String[] arrayString = aString.split("[ ,.]");
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println(arrayString[i]);
        }
        */
        
        /*
        String amend = " white space ";
        System.out.println(amend);
        amend = amend.trim( );
        System.out.println(amend);
        */
        
        String heading1 = "Exam_Name";
        String heading2 = "Exam_Grade";

        System.out.printf( "%-15s %15s %n", heading1, heading2); 
    }
    
}
