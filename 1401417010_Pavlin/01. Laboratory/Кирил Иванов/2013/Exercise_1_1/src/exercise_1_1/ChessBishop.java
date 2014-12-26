package exercise_1_1;

public class ChessBishop extends ChessPosition {
    
    private String type;
    
    protected String getType() {
        return type;
    }

    protected final void setType(String type) {
        this.type = type;
    }
    
    protected ChessBishop(String position, String type) {
        
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
            
            char rightUpLetter = (char)((position.charAt(0) + count));
            char rightUpNumber = (char)((position.charAt(1) + count));
            
            String rightUpPath = Character.toString(rightUpLetter).concat(Character.toString(rightUpNumber));

            char rightDownLetter = (char)((position.charAt(0) + count));
            char rightDownNumber = (char)((position.charAt(1) - count));

            String rightDownPath = Character.toString(rightDownLetter).concat(Character.toString(rightDownNumber));
            
            char leftUpLetter = (char)((position.charAt(0) - count));
            char leftUpNumber = (char)((position.charAt(1) + count));
            
            String leftUpPath = Character.toString(leftUpLetter).concat(Character.toString(leftUpNumber));
            
            char leftDownLetter = (char)((position.charAt(0) - count));
            char leftDownNumber = (char)((position.charAt(1) - count));
            
            String leftDownPath = Character.toString(leftDownLetter).concat(Character.toString(leftDownNumber));
            
            count++;
            
            if(rightUpPath.equals(enemyPosition) || rightDownPath.equals(enemyPosition) || leftUpPath.equals(enemyPosition) || leftDownPath.equals(enemyPosition)) {
            
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
