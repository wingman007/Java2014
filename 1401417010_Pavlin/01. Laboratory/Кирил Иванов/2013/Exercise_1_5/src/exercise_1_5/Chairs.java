package exercise_1_5;

public class Chairs {
    
    private String model;
    private int minHeight;
    private int maxHeight;

    protected String getModel() {
        return model;
    }

    protected int getMinHeight() {
        return minHeight;
    }

    protected int getMaxHeight() {
        return maxHeight;
    }

    protected final void setModel(String model) {
        this.model = model;
    }

    protected final void setMinHeight(int minHeight) {
        this.minHeight = minHeight;
    }

    protected final void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    protected Chairs(String model, int minHeight, int maxHeight) {
        
        setModel(model);
        setMinHeight(minHeight);
        setMaxHeight(maxHeight);
    }
    
    protected void intervalHeight(Chairs object) {
        
        int overallMinHeight = getMinHeight() > object.getMinHeight() ? getMinHeight() : object.getMinHeight();
                   
        int overallMaxHeight = getMaxHeight() < object.getMaxHeight() ? getMaxHeight() : object.getMaxHeight();     
   
        System.out.println("Стол 1 е от модел " + getModel() + " с минимална височина " + getMinHeight() + " и максимална височина " + getMaxHeight() + ".");
        System.out.println("Интервалът в регулируемата височина на този стол е " + (getMaxHeight() - getMinHeight()) + ".\n");
        
        System.out.println("Стол 2 е от модел " + object.getModel() + " с минимална височина " + object.getMinHeight() + " и максимална височина " + object.getMaxHeight() + ".");
        System.out.println("Интервалът в регулируемата височина на този стол е " + (object.getMaxHeight() - object.getMinHeight()) + ".\n");
        
        int overallIntervalHeight = overallMaxHeight - overallMinHeight;
        
        if(overallIntervalHeight > 0) {
            
            System.out.println("Общият интервал в регулируемата височина на столовете е " + overallIntervalHeight + ".\n");
        }
        
        else {
            
            System.out.println("Столовете нямат обща височина.\n");  
        }
    }
}
