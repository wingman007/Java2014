/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labyrinth;

/**
 *
 * @author dev
 */
public class Labyrinth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String labyrinth[][] = new String[5][5];
        labyrinth = populateLabyrinth(5, 5);
        visualizeLabyrinth(labyrinth);
        findpath(labyrinth, 0, 0);
        System.out.println("=========================================");
        visualizeLabyrinth(labyrinth);
//        visualizeLabyrinth(findPath(labyrinth, 0, 0));
        
//        String [][] labyrinthRightPath = findPath(labyrinth, 0, 0, 5, 5);
//        visualizeLabyrinth(labyrinthRightPath);
        
        
    }
    
    
//    public static boolean rightDirection()
//    {
//        
//    }
    
    
    
    public static void findpath(String lab[][], int row, int col)
    {
        if(col >= lab[0].length || row >=lab.length || col <0 || row < 0)
        {
            return;
        }
        
        if(lab[row][col] != "p")
        {
            return;
        }
        
        if(lab[row][col]=="e")
        {
            System.out.println("You've reached the exit !");
            return;
        }
        
        lab[row][col] = "S";
        
        findpath(lab, row-1, col);
        findpath(lab, row+1, col);
        findpath(lab, row, col+1);
        findpath(lab, row, col-1);
        
        
    }
    
    
    public static String[][] populateLabyrinth(int dimension1, int dimension2)
    {
        
        String[][] labyrinth = new String[dimension1][dimension2];
        String obstacle = "*";
        String pass = "p";
        String exit = "e";
        int tmp;
        int obstacleCounter = 0;
        
        for(int counter = 0; counter < 5; counter++)
        {
            for(int subCounter = 0; subCounter < 5; subCounter++)
            {
                if(counter < 4 || subCounter < 4)
                {
                    tmp = (int) ( Math.random() * 2 + 1);
                    if(tmp == 1)
                    {
                        if(obstacleCounter <= 10 && counter !=0 && subCounter !=0)
                        {
                            labyrinth[counter][subCounter] = obstacle;
                            obstacleCounter++;
                        }
                        else
                        {
                            labyrinth[counter][subCounter] = pass;
                        }
                    }
                    else if(tmp == 2)
                    {
                        labyrinth[counter][subCounter] = pass;
                    }
                }
                else
                {
                    labyrinth[counter][subCounter] = exit;
                }
            }
            
        }
        return labyrinth;
    }
    
    public static String[][] visualizeLabyrinth(String lab[][])
    {
       int primaryCounter = lab.length;
       int secondaryCounter = lab[0].length;
       
       for(int row =0; row < primaryCounter; row++)
       {
           for(int col = 0; col < secondaryCounter; col++)
           {
               System.out.print(lab[row][col] + ", ");
           }
           System.out.println("\n");
       }
       return lab;
    }
    
}
