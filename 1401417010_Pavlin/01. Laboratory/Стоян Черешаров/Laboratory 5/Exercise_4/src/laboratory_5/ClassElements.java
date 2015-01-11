package laboratory_5;

// декларация на класа
public class ClassElements { // тяло
    
    public String name; // пример за поле/променлива (field, variable) - в случая instance variable (implicit) (also member variable)
    
    public int age = 23; // пример за поле/променлива (field, variable) с атрибут/свойство (attribute, property) - в случая instance variable (explicit) (also member variable)
    
    public static String staticName; // пример за поле/променлива (field, variable) - в случая static variable или class variable или global variable  (implicit) (and also member variable)
    
    static final double PI = 3.141592653589793; // пример за константа (constant)
    
    public ClassElements() { // празен конструктор (constructor)
 
    }
    
    public void classMethod() { // празен метод/функция (method, function)
        
        String localVar; // пример за поле/променлива (field, variable) - в случая local variable (implicit)
    }
    
    public void getAttribute(String par1) { // пример за метод/функция с атрибут/свойство
        
    }
    
    public static void main(String[] args) { // декларация на основен метод с аргумент
        
        ClassElements object = new ClassElements(); // пример за инстанциране на обект
        
        object.getAttribute("Attribute"); // пример за обект с атрибут/свойство
    }
}
