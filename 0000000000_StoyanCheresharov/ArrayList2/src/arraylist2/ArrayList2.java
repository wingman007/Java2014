/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylist2;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author fmi
 */
public class ArrayList2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList listTest = new ArrayList();
        // ArrayList<String> listTest = new ArrayList<String>();
        // You can only add objects, however
        listTest.add( "first item" );
	listTest.add( "second item" );
	listTest.add( "third item" );
	listTest.add( 7 );
        
        // To go through each item in your ArrayList you can set up something called an Iterator.
        Iterator it = listTest.iterator( );

        while ( it.hasNext( ) ) {
            System.out.println( it.next( ) );
        }
        
// You can also remove items from an ArrayList. 
        listTest.remove(2);

        // Or you can use the value on the list:
        listTest.remove( "second item" );

        // to print the whole list
        System.out.println("Whole list = " + listTest);

        // System.out.println("Position 1 = " + listTest(1));        
    }
    
}
