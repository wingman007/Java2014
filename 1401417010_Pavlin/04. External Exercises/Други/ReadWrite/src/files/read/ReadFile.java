package files.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    
    public static String[] readFromFile(String path) throws IOException {

        FileReader read = new FileReader(path);

        String[] textData;
        
        try (BufferedReader textReader = new BufferedReader(read)) {
            
            int numberOfLines = readLines(path);
            
            textData = new String[numberOfLines];
            
            for (int i=0; i < numberOfLines; i++) {
                textData[i] = textReader.readLine();
            }
        }
        
        return textData;
    }
    
    public static int readLines(String path) throws IOException {

        FileReader read = new FileReader(path);	
        
        int numberOfLines;
        
        try (BufferedReader textReader = new BufferedReader(read)) {
            
            numberOfLines = 0;
            
            while (textReader.readLine() != null) {
                numberOfLines++;
            }
        }

        return numberOfLines; 
    } 
}
