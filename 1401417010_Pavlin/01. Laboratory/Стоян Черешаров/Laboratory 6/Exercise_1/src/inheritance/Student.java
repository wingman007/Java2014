package inheritance;

public class Student extends Human {
    
    private int fNumber;

    public int getfNumber() {
        return fNumber;
    }

    public void setfNumber(int fNumber) {
        this.fNumber = fNumber;
    }
    
    public void introduceYourSelf(String firstName, String lastName, int age, int fNumber) {
        
        // поради липса на конструктор за super(firstName, lastName, age)
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age); 

        setfNumber(fNumber);
        System.out.println("Аз съм " + getFirstName() + " " + getLastName() + " и съм на " + getAge() + " години.");
        System.out.println("Аз съм студент. Моят факултетен номер е " + getfNumber() + ".");
    }
}
