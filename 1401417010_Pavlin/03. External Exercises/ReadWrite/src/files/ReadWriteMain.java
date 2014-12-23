package files;

import java.io.IOException;


public class ReadWriteMain {

    public static void main(String[] args) {
        
        try {
            
            String path = "src\\files\\THETA";
            
            String[] result = ReadFile.readFromFile(path);
            
            for (String row : result) {
                System.out.println(row);
            }
                
            WriteFile.writeToFile(path, "THETA", true);
        }
        
        catch(IOException err) {
            
            System.out.println(err.getMessage());
        } 
    }  
}