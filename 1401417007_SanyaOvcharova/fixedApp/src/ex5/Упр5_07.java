package ex5;


import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;


/**
 *
 * @author SanyaNo
 */
public class Упр5_07 {
    /*
     * Декларирайте и дефинирайте клас, като за идентификатори на 
     * всичките му елементи (полета, методи, име на клас, конструктори) 
     * използвате само кирилица.
     */
    private static String име = "Иван";
    private static String фамилия = "Драгомиров";
    
    
    
    public static void main(String[] args) {
        
       System.out.println("defaultCharacterEncoding by code: " + getDefaultCharEncoding());
       System.setProperty("file.encoding" , "UTF-16");
        
        
        System.out.println(име +" " +фамилия);
        System.out.println("New encoding: " + System.getProperty("file.encoding"));
        
        
    }
    
    /*
     * Function source 
     * http://javarevisited.blogspot.com/2012/01/get-set-default-character-encoding.html
     * 
     * @return 
     */
      public static String getDefaultCharEncoding(){
        byte [] bArray = {'w'};
        InputStream is = new ByteArrayInputStream(bArray);
        InputStreamReader reader = new InputStreamReader(is);
        String defaultCharacterEncoding = reader.getEncoding();
        return defaultCharacterEncoding;
    }



    
}
