/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package readwrite;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author fmi
 */
public class ReadWrite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            writeToFile("C:\\Users\\fmi\\test.txt", "Another line", true );
            
            
            String[] result = readFile("C:\\Users\\fmi\\test.txt");
            for (String row : result) {
                System.out.println(row);
            }
            
            
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static String[] readFile(String path)  throws IOException
    {
        // String path = "c:\\test.txt";
        // This reads bytes from a text file, and each byte is a single character
        FileReader fr = new FileReader(path);

        // You can read whole lines of text, rather than single characters. 
        // To do this, you can hand your FileReader over to something called a BufferedReader
        BufferedReader textReader = new BufferedReader(fr);

        // first variant
        // int numberOfLines = 3; // hard code the number of lines
        // int numberOfLines = 3; // readLines();
        int numberOfLines = readLines(path);
        String[ ] textData = new String[numberOfLines];

        int i;

        for (i=0; i < numberOfLines; i++) {
            textData[ i ] = textReader.readLine();
        }

        textReader.close( );
        
        return textData;
    }
    
    public static int readLines(String path) throws IOException {
        // This reads bytes from a text file, and each byte is a single character
        FileReader fr = new FileReader(path);		
        BufferedReader textReader = new BufferedReader(fr);

        String aLine;
        int numberOfLines = 0;

        while ((aLine = textReader.readLine()) != null) {
                numberOfLines++;
        }

        textReader.close();

        return numberOfLines;
    }	    
    
    public static void writeToFile(String path, String textLine, Boolean appendToFile ) throws IOException {
        // The FileWriter write bytString pathes
        FileWriter write = new FileWriter( path , appendToFile);
        // But we can hand the FileWriter plain text with the aid of the PrintWriter class
        PrintWriter printLine = new PrintWriter( write );

        printLine.printf( "%s" + "%n" , textLine);

        // This line closes the text file and frees up any resources it was using
        printLine.close( );
    }    
    
}
