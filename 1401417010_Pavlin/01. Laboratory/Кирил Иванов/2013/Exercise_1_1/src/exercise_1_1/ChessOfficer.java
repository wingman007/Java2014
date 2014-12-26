package exercise_1_1;

public class ChessOfficer extends ChessPosition {
    
    private String type;
    
    protected String getType() {
        return type;
    }

    protected final void setType(String type) {
        this.type = type;
    }
    
    protected ChessOfficer(String position, String type) {
        
        setPosition(position);
        setType(type);
    }
    
    protected void intro() {
        System.out.println("Позицията на " + getType() + " офицер e " + getPosition() + ".");
        System.out.println("Офицер " + getType() + " се намира на " + checkSquareColor() + " квадрат.");
    }
    
    protected void takeWithOneMove(ChessPosition enemyChessOfficer) {

        boolean takeWithOneMove = false;
        
        String position = getPosition();
        String enemyPosition = enemyChessOfficer.getPosition();
        
        int count = 1;
        
        for(int i = 0; i < 7; i++) {
            
            char rightUpLetter = (char)((enemyPosition.charAt(0) + count));
            char rightUpNumber = (char)((enemyPosition.charAt(1) + count));
            
            String rightUpString = Character.toString(rightUpLetter).concat(Character.toString(rightUpNumber));

            char rightDownLetter = (char)((enemyPosition.charAt(0) + count));
            char rightDownNumber = (char)((enemyPosition.charAt(1) - count));

            String rightDownString = Character.toString(rightDownLetter).concat(Character.toString(rightDownNumber));
            
            char leftUpLetter = (char)((enemyPosition.charAt(0) - count));
            char leftUpNumber = (char)((enemyPosition.charAt(1) + count));
            
            String leftUpString = Character.toString(leftUpLetter).concat(Character.toString(leftUpNumber));
            
            char leftDownLetter = (char)((enemyPosition.charAt(0) - count));
            char leftDownNumber = (char)((enemyPosition.charAt(1) - count));
            
            String leftDownString = Character.toString(leftDownLetter).concat(Character.toString(leftDownNumber));
            
            count++;
            
            if(position.equals(rightUpString) || position.equals(rightDownString) || position.equals(leftUpString) || position.equals(leftDownString)) {
            
                takeWithOneMove = true;
                break;
            }
        }
        
        if(takeWithOneMove == true) {
            
            System.out.println("\nОфициер " + getType() + " МОЖЕ да вземе другия с един ход.");  
        }
        
        if(takeWithOneMove == false) {
            
            System.out.println("\nОфициер " + getType() + " НЕ МОЖЕ да вземе другия с един ход.");
        }
    }
}
