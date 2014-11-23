/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datatypes;

import java.io.IOException;
import java.util.*;

/**
 *
 * @author fmi
 */
public class DataTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        if (args.length != 0) {
            System.out.println(Arrays.toString(args));
        }
        // TODO code application logic here
        byte myByte = 22; 
        short myShort = 257; 
        int myInt = -123;
        long myLong = 123L; // 077 0x077
        
        float myFloat = 2.34F;
        double myDouble = 2.34; // 
        
        char myChar = 'c'; //'\u0000'
        boolean myBoolean = false; // true
        
        // -------------------- Referent -----
        String myName = "Stoyan\\ "; // \n
        Object myOtherByte = 3;
        
        System.out.print(myName);
        System.out.println(myName);
        
        // int ch;
        // 1.
        // ch = System.in.read();
       // System.out.print((char) ch);
        
        // while ((ch = System.in.read()) != '\n') {
        //    System.out.print((char) ch);
        // }
        
        // 2.
        // java.util.Scanner input = new java.util.Scanner(System.in);
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter your first name: ");
        String firstName = input.nextLine();
        System.out.println(firstName);
        
        double number1 = 3.14;
        double number2 = 2.71;
        
        System.out.println(number1 + number2);
        
        System.out.printf("%.3f \n", number1 + number2);
        
//  Old way for reading symbols
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String firstString = br.readLine();
//        String lastString = br.readLine();
//        System.out.printf("Hello, %s %s!\n", firstString, lastString);



      for(int i = 0; i < 10; i++)
      {
          for (int j = 0; j < i; j ++)
          {
            System.out.print('*');
          }
          System.out.print("\n");
      }
      
      Operations(2.32, 45.6);
      
      // Excersise 2
      // ############################################## 2 ###################################
      // 1. Type conversions
        long minNumber = 1;
        long maxNumber = 1000000;

        // Generates a random number between 1 and 1000000
        long uniqueID = minNumber + (long)(Math.random() * ((maxNumber - minNumber) + 1));

        // You can cast from one primitive value into another by putting what you want between ( )
        // (byte) (short) (long) (double)
        // (float), (boolean) & (char) don't work.
        // (char) stays as a number instead of a character

        // You convert from a primitive to a string like this
        String stringNumber = Long.toString(maxNumber);

        // Byte.toString(bigByte); Short.toString(bigShort); Integer.toString(bigInt);
        // Float.toString(bigFloat); Double.toString(bigDouble); Boolean.toString(trueOrFalse);

        // You convert from a String to a primitive like this
        int numberString = Integer.parseInt(stringNumber);

        // parseShort, parseLong, parseByte, parseFloat, parseDouble, parseBoolean

        System.out.println("Unique ID set to: " + uniqueID);
      
        
        // 2) If
      String name = "";
      
    // userInput.hasNextLine() returns true if a String was entered in the keyboard
       if(input.hasNextLine()){

           // userInput.nextLine() returns the value that was entered at the keyboard
           System.out.print("Enter your family name; \n");
           name = input.nextLine();

           // hasNextInt, hasNextFloat, hasNextDouble, hasNextBoolean, hasNextByte,
           // hasNextLong, nextInt, nextDouble, nextFloat, nextBoolean, etc.

       }
       
      System.out.printf("%s \n", name);
     
      // 3. if-else
        int randomNumber = (int) (Math.random() * 126) + 1;
	         
	char favoriteChar = (char) randomNumber;
	         
	// if then else statement
	// > < == != >= <=
	if(randomNumber == 32){

            System.out.println("Favorite character set to: Space");

        } else if(randomNumber == 10){

            System.out.println("Favorite character set to: New Line");

        } else {

            System.out.println("Favorite character set to: " + favoriteChar);

        }
      
    
        // Logical operators
        // ! Logical operators : Converts the boolean value to its right to its opposite form ie. true to false
        // & : Returns true if boolean value on the right and left are both true (Always evaluates both boolean values)
        // && : Returns true if boolean value on the right and left are both true (Stops evaluating after first false)
        // | : Returns true if either boolean value on the right or left are true (Always evaluates both boolean values)
        // || : Returns true if either boolean value on the right or left are true (Stops evaluating after first true)
        // ^ : Returns true if there is 1 true and 1 false boolean value on the right or left

        if((randomNumber > 97) && (randomNumber < 122)){

            System.out.println("Favorite character is a lowercase letter");

        }

        if(((randomNumber > 97) && (randomNumber < 122)) || ((randomNumber > 64) && (randomNumber < 91))){

            System.out.println("Favorite character is a letter");

        }

        if(!false){

            System.out.println("I turned false to " + !false);

        }

        // The ternary operator assigns one or another value based on a condition
        int whichIsBigger = (50 > randomNumber) ? 50 : randomNumber;

        System.out.println("The biggest number is " + whichIsBigger);
        
        
      // 4. switch
    // The switch statement is great for when you have a limited number of values
        // and the values are int, byte, or char unless you have Java 7 which allows Strings
        switch(randomNumber){

        case 8 :
            System.out.println("Favorite character set to: Backspace");
            break;

        case 9 :
            System.out.println("Favorite character set to: Horizontal Tab");
            break;

        case 10 :
        case 11 :
        case 12 :
            System.out.println("Favorite character set to: Something else weird");
            break;

        default :
            System.out.println("Favorite character set to: " + favoriteChar);
            break;

        }        
        
        
        // 5. loops
         // System.out.println(1);
         // System.out.println(2);
         // System.out.println(3);
        
        // 5.1 while
        int i = 1;
        while(i < (maxNumber / 2000)){

            System.out.println(i);
            i++;

            // This isn't needed, but if you want to jump out of a loop use break
            if(i == (maxNumber/20000)) break;
        }
        
        // 5.2 do - while
        int number = 50;
        // Do while loops are used when you want to execute the code in the braces at least once
        do {

            System.out.println("Guess my number up to 100");

            // If what they entered isn't a number send a warning
            while(!input.hasNextInt()){

                String numberEntered = input.next();
                System.out.printf("%s is not a number\n", numberEntered);

            }
            number = input.nextInt();

        }while(number != 50);

        System.out.println("Yes the number was 50");	
        

	 // 5.3 for       
        for(int i1 = 0; i1 <= 100; i1++){

            // continue is used to skip 1 iteration of the loop
            if(i1 == 90) continue;

            System.out.println(i1);

        }
        // 5.4
        int[] numbers = {2, 3, 5, 7, 11, 13, 17, 19};
        for (int i2 : numbers){
            System.out.println(i2);
        }
        
         // An array is a fixed series of boxes that contain multiple values of the same data type
	 // How you create arrays
	 // int[] favoriteNumbers;
	 // favoriteNumbers = new int[20];
	 
         int[] favoriteNumbers1 = new int[20];
	         
        favoriteNumbers1[0] = 100;

        String[] stringArray = {"Random", "Words", "Here"};

        // for(dataType[] varForRow : arrayName)
        for(String word : stringArray)
        {
            System.out.println(word);
        }
     
	// This is a multidimensional array
        String[][][] arrayName = { 
            { 
                { "000", "more1" }, 
                { "100", "more2" }, 
                { "200", "more3" }, 
                { "300", "more4" } 
            },
            { 
                { "010", "more5" }, 
                { "110", "more6" }, 
                { "210", "more7" }, 
                { "310", "more8" } 
            },
            { 
                { "020", "more9" }, 
                { "120", "more10" }, 
                { "220", "more11" }, 
                { "320", "more12" } 
            }
        };
        System.out.println(arrayName[2][3][1]);
 /* 	         
        for(int i = 0; i < arrayName.length; i++)
        {
            for(int j = 0; j < arrayName[i].length; j++)
            {

                for(int k = 0; k < arrayName[i][j].length; k++)
                {
                    System.out.print("| " + arrayName[i][j][k] + " ");

                }
            }

            System.out.println("|");

        }        
 */  
         // You can copy an array (stringToCopy, indexes to copy)
        String[] cloneOfArray = Arrays.copyOf(stringArray, 3);

        // You can print out the whole array
        System.out.println(Arrays.toString(cloneOfArray));

        // Returns the index or a negative number
        System.out.println(Arrays.binarySearch(cloneOfArray, "Random"));

       Operations(1.0, 2.0); 
        Operations(4.5, 1, 2, 3, 4);
        
        System.out.println(factoriel(10));
        
        Random randomGen = new Random();
        
        randomGen = null;
        // coolcsn.System.myMethod myClass = new coolcsn.System.myMethod();
        // 1. non static        
        // datatypes.Test test = new datatypes.Test();
        // test.getAge();
        
        datatypes.Test.getAge();
        
    }
    
    static void Operations(double par1, double par2)
    {
        System.out.printf("%.2f + %.2f = %.2f", par1, par2, par1 + par2); 
    }
 
    static void Operations(double par1, int... elements)
    {
        System.out.printf("\n %.2f ", par1); 
        for (int number : elements) {
            System.out.println(number);
        }
    }
    
    public static int factoriel(int n)
    {
        if(n <= 1) return 1;
        return factoriel(n - 1) * n;
    }
}

/*
import java.util.*;
public class ReadingStringsNewStyle {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Please enter your first name: ");
String firstName = input.nextLine();
System.out.print("Please enter your last name: ");
String lastName = input.nextLine();
System.out.printf("Hello, %s %s!\n", firstName, lastName);
// input.close(); - Don't close Scanner reading System.in!
}
}
*/