package composition;
 
public class TestPerson {
 
    public static void main(String[] args) {
        
        Person1 person1 = new Person1();
        
        System.out.println(person1.getSalary());
        
        
        Person2 person2 = new Person2();
        
        System.out.println(person2.getSalary());
    }
}