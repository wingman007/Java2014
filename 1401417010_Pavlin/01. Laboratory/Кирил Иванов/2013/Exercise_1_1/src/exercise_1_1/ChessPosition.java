package exercise_1_1;

public class ChessPosition {

    private String position;
    
    protected String getPosition() {
        return position;
    }

    protected final void setPosition(String position) {
        this.position = position;
    }
    
    protected String checkSquareColor() {
        
        String squareColor = "непознат";
        
        String letter = getPosition().substring(0, 1);
        
        int number = Integer.parseInt(getPosition().substring(1, 2));
        
        boolean isOdd = false;
        boolean isEven = false;
        
        if(number % 2 == 1) {
            
            isOdd = true;
        }
        
        if(number % 2 == 0) {
            
            isEven = true;
        }
        
        if(letter.matches("[aceg]") && isOdd) {
            
            squareColor = "черен";
        }
        
        if(letter.matches("[aceg]") && isEven) {
            
            squareColor = "бял";
        }
        
        if(letter.matches("[bdfh]") && isOdd) {
            
            squareColor = "бял";
        }
        
        if(letter.matches("[bdfh]") && isEven) {
            
            squareColor = "черен";
        }
        
        return squareColor;
    }
}
