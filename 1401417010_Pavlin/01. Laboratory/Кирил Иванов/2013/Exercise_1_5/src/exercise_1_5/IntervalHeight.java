package exercise_1_5;

public class IntervalHeight {
    
    protected void intervalHeight(Chairs object1, Chairs object2) {
        
        int overallMinHeight = object1.getMinHeight() > object2.getMinHeight() ? object1.getMinHeight() : object2.getMinHeight();
                
        int overallMaxHeight = object1.getMaxHeight() < object2.getMaxHeight() ? object1.getMaxHeight() : object2.getMaxHeight();     
   
        System.out.println("Стол 1 е от модел " + object1.getModel() + " с минимална височина " + object1.getMinHeight() + " и максимална височина " + object1.getMaxHeight() + ".");
        System.out.println("Интервалът в регулируемата височина на този стол е " + (object1.getMaxHeight() - object1.getMinHeight()) + ".\n");
        
        System.out.println("Стол 2 е от модел " + object2.getModel() + " с минимална височина " + object2.getMinHeight() + " и максимална височина " + object2.getMaxHeight() + ".");
        System.out.println("Интервалът в регулируемата височина на този стол е " + (object2.getMaxHeight() - object2.getMinHeight()) + ".\n");
        
        int overallIntervalHeight = overallMaxHeight - overallMinHeight;
        
        if(overallIntervalHeight > 0) {
            
            System.out.println("Общият интервал в регулируемата височина на столовете е " + overallIntervalHeight + ".");
        }
        
        else {
            
            System.out.println("Столовете нямат обща височина.");  
        }
    }
}
