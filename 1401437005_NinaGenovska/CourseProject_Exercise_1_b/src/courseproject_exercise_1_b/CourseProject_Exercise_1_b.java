/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseproject_exercise_1_b;

import java.util.Random;

/**
 *
 * @author Nina
 */
public class CourseProject_Exercise_1_b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = new int[6];
        int multiplied = 1;
        for(int i = 0; i < arr.length; i++){
            arr[i] = generate();
            System.out.println(arr[i]);
            if(arr[i]%2 != 0 && arr[i] != 0){
                multiplied = multiplied * arr[i];
            }
        }
        System.out.println( " Произведението на всички нечетни числа различни от нула e: " + multiplied);
    }
    private static int generate(){
        Random r = new Random();
        int n = r.nextInt(201);
        return n-100;
    }
}
        
    
    

