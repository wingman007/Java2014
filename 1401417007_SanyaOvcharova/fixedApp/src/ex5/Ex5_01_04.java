
package ex5;

/**
 *
 * @author SanyaNo
 */

/*
 *
 * Дефинирайте клас който отразява човек. За решаване на конкретен проблем от
 * всички характерситики на човека ни интересуват име, фамилия и години. Класът
 * трябва да съдържа функционалност, която позволява на всеки конкретен обек от
 * този клас да се представи с името, фамилията и възрастта си.
 */
public class Ex5_01_04 {
    
    /**
     * First name
     */
    private String name;
    /**
     * Surname 
     */
    private String surname;
    
    /**
     * Age of the person
     */
    private int age;

    public static void main(String[] args) {
        
       
    }
    
    /**
     * 
     * @param String name
     * @param String surname
     * @param int age 
     */

    Ex5_01_04(String name, String surname, int age) {
        
        
        setAge(age);
        setName(name);
        setSurname(surname);

    }
    
    /**
     * 
     * @param int age 
     */

    public void setAge(int age) {

        this.age = age;

    }
    
    /**
     * 
     * @param String name 
     */

    public void setName(String name) {

        this.name = name;

    }
    
  /**
   * 
   * @param String surname 
   */

    public void setSurname(String surname) {

        this.surname = surname;

    }
    
    /**
     * 
     * @return integer
     */

    public int getAge() {

        return age;

    }
    
    /**
     * 
     * @return String
     */
    public String getName() {

        return name;

    }
    
    /**
     * 
     * @return String
     */

    public String getSurname() {

        return surname;

    }
    
    /**
     * Introduction of the person
     * 
     */
    public void intro(){
        
        //System.out.println("My name is " + name + " " + surname + " and I am " +age + " years old.");
        System.out.printf("My name is %s %s and I am %d years old", name, surname, age);
        System.out.println();
    }
}
