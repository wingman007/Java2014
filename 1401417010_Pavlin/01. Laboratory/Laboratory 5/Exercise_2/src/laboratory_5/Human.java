package laboratory_5;

public class Human {
    
    public String firtsName;
    public String lastName;  
    public int age;

    public void introduceYourSelf(String firtsName, String lastName, int age) {

        this.firtsName = firtsName;
        this.lastName = lastName;
        this.age = age;

        System.out.println("Аз съм " + firtsName + " " + lastName + " и съм на " + age + " години.");
    }
    
    public static void main(String[] args) {

        Human person1 = new Human();
        
        person1.introduceYourSelf("Иван", "Димитров", 23);
    }
}