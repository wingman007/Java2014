package laboratory_5;

public class ClassA {

    public static void main(String[] args) {
        
        System.out.println("Public access modifier for ClassA");
        getObject();
    }
    
    private static void getObject() {
        
        ClassB myObject = new ClassB();
        System.out.println(myObject.access);
    }
}
