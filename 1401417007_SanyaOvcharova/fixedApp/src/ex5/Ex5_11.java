
package ex5;

/**
 *
 * @author SanyaNo
 */
public class Ex5_11 {
    /*
     * Декларирайте 2 класа  A и B в един пакет. 
     * Настройте модификаторите им за достъп така,
     * че те да са достъпни един за друг но само клас A  
     * да бъде достъпен за други класове. Съзадайте обект 
     * от клас B, в  метод на клас А.
     */
    
     private class Ex5_11_1{
      Ex5_11_1(){
          
          System.out.println("Access only through class Ex5_11");
          
      }
      
      
    }
    
    public static void main(String[] args) {
      Ex5_11 smth = new Ex5_11();
      smth.getInstance();
    }
    
    public void getInstance(){
        Ex5_11_1 test = new Ex5_11_1();
    }
}
