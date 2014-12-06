package files.main;

import static files.read.ReadFile.readFromFile;
import static files.write.WriteFIle.writeToFIle;

import java.io.IOException;


public class ReadWriteMain {

    public static void main(String[] args) {
        
        try {
            
            String path = "src\\files\\THETA.nfo";
            
            String[] result = readFromFile(path);
            
            for (String row : result) {
                System.out.println(row);
            }
                
            writeToFIle(path, "THETA", true);
        }
        
        catch(IOException err) {
            
            System.out.println(err.getMessage());
        } 
    }  
}