package laboratory_5;

public class ClassA {
    
    private int myField;
    
    public static void main(String[] args) {

        ClassA object = new ClassA();
        
        System.out.println("myField : " + object.myField);
        
        object.setMyField(1);
        object.printMyField();
    }
    
    public void setMyField(int myField) {
        
        this.myField = myField;
        System.out.println("myField получава стойност : " + myField);
    }
    
    public void printMyField() {
        
        System.out.println("myField : " + myField);
    }
}
