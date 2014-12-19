package files.write;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFIle {
    
    public static void writeToFIle(String path, String textLine, Boolean appendToFile) throws IOException {
        
        FileWriter write = new FileWriter(path , appendToFile);
        
        try (PrintWriter printLine = new PrintWriter(write)) {
            
            printLine.printf( "%s" + "%n" , textLine);
        }
    }  
    
}
