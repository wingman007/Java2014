package laboratory_5;

public class ReturnObjects {
    
    private static int objectsNumber;
    
    private ReturnObjects() {
        
        objectsNumber++;
    }
    
    public static void main(String[] args) {
        
        ReturnObjects object1 = new ReturnObjects();
        ReturnObjects object2 = new ReturnObjects();
        ReturnObjects object3 = new ReturnObjects();
        
        System.out.println("The number of objects in this class is : " + objectsNumber); 
    }
}
