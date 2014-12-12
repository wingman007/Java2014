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
public class Person {
    public String name;
    public String surname;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
     public Person (String name, String surname, int age) {
     this.name = name;
     this.surname = surname;
     this.age = age;
    }
    public void IntroduceYourself(){
    System.out.println(" Hello world!I am a person.My name is " + name + "." + "My surname is " + surname + "." + " I am " + age + " years old."); 
    
    }
}
