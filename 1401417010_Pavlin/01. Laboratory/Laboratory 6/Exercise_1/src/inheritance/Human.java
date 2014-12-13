package inheritance;

public class Human {
    
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void introduceYourSelf(String firstName, String lastName, int age) {
        
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age); 
        
        System.out.println("Аз съм " + getFirstName() + " " + getLastName() + " и съм на " + getAge() + " години. \n");
    }
}
