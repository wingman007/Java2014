/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication21;

/**
 *
 * @author fmi
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     String name [] = {"Ivelin", "Ivan", "Nina", "Violin", "Ivon"};
        nameFinishesWith(name,"in");
    }

    private static void nameFinishesWith(String name [] , String search) {
      System.out.println("nameFinishesWith" + search + ":"); 
      for(int i=0; i<name.length; i++)
     //  if(name[i].FinishesWith(search))
      if(name[i].endsWith(search))
      System.out.println(name[i]);   
    }
    
}
