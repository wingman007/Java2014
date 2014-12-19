package laboratory_5.class_a;

import laboratory_5.class_b.ClassB;

public class ClassA {

    public static void main(String[] args) {
        getObjects();
    }
    
    public static void getObjects() {
        
        ClassB object = new ClassB();
        object.makeObject();
        System.out.println("Reference : " + object);
    }
}
