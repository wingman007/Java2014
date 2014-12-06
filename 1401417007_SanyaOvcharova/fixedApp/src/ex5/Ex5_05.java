
package ex5;

/**
 *
 * @author SanyaNo
 */
public class Ex5_05 {
    /*
     * Отпечатайте на конзолата стойността на променлива 
     * съдържаща обект (тя всъщност съдържа референция към обект).
     */
    
   
   
    public static void main(String[] args) {
      
         Ex5_01_04 ivan = new Ex5_01_04("Ivan", "Petrov", 42);
         
         System.out.println(ivan.toString());
         System.out.println(ivan);
        //System.out.println(someObject.toString());
        
    }
}
