package ex5;

/**
 *
 * @author SanyaNo
 */
public class Ex5_09 {

    private int myField;

    /*
     * Декларирайте клас A с 2 метода и едно поле с име "myField" от 
     * тип "int". Единият от методите да приема параметър с име "myField" 
     * от тип int и да назначава стойността на полето "myField". Другият 
     * метод трябва да отпечатва на конзолата стойността на полето "myField".
     * 
     */
    public static void main(String[] args) {
        
        Ex5_09 test = new Ex5_09();
        int var = 12;
        test.setMyField(var);
        test.getMyField();
        
    }

    public void setMyField(int someNumber) {

        myField = someNumber;

    }

    public void getMyField() {
        
        System.out.println(myField);
        
    }
}
