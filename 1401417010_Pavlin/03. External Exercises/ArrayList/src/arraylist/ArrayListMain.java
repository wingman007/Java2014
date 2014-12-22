package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMain {

    public static void main(String[] args) {

        ArrayList myArrayList = new ArrayList();
        
        ArrayList<String> myArrayListBackup = new ArrayList<>(); // With the diamond interface for type String
        
        myArrayList.add("1 row");
        myArrayList.add("2 row");
        myArrayList.add("3 row");
        myArrayList.add("4 row");
        myArrayList.add("5 row");
        myArrayList.add("6 row");
        myArrayList.add("7 row");
        myArrayList.add("8 row");
        myArrayList.add("9 row");
        myArrayList.add("10 row");
        
        myArrayList.add(2, "This goes on 3 row");
        
        myArrayList.set(0, "This replace 1 row");

        myArrayList.remove(5);
        
        myArrayListBackup.addAll(myArrayList); // Copy all from one array to another
        
        if(myArrayListBackup.containsAll(myArrayList)) {
            
            System.out.println("myArrayBackup containsAll from myArray \n");
        }
        
        System.out.println(myArrayListBackup + "\n"); // For debugging
        
        myArrayListBackup.clear();
        
        if(myArrayListBackup.isEmpty()) {
            System.out.println("myArrayBackup is Empry \n"); 
        }
        
        Object[] myArray = myArrayList.toArray();
        
        System.out.println(Arrays.toString(myArray) + "\n");
        
        for(Object elements : myArrayList) { // Can use Lambda Expressions (Java 8)
            
            System.out.println(elements);
        }
    }
}
