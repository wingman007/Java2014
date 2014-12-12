/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexercise5;

/**
 *
 * @author Nina
 */
public class JavaExercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person nina;
        nina = new Person (" Nina", " Genovska", 32);
        //nina.name = " Nina ";
        //nina.surname = " Genovska ";
        //nina.age = 32;
        //System.out.println(" I am a person.My name is " + nina.name + "." + "My surname is " + nina.surname + "." + " I am " + nina.age + " years old.");
        nina.IntroduceYourself();
        Person george;
        george = new Person("George", "Georgiev", 20);
        //george.name = " George ";
        //george.surname = " Georgiev ";
        //eorge.age = 20;
        //System.out.println(" I am a person.My name is " + george.name + "." + "My surname is " + george.surname + "." + " I am " + george.age + " years old.");
        george.IntroduceYourself();
    }
    
}
