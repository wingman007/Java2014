package laboratory_5;

class ClassA {

    public static void main(String[] args) {
        getObject();
    }
    
    private static void getObject() {
        
        ClassB myObject = new ClassB();
        System.out.println(myObject.access);
    }
}
