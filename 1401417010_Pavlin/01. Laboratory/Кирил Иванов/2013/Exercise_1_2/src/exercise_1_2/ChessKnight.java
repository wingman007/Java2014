package exercise_1_2;

public class ChessKnight extends ChessPosition {

    private String type;

    protected String getType() {
        return type;
    }

    protected final void setType(String type) {
        this.type = type;
    }

    protected ChessKnight(String position, String type) {

        setPosition(position);
        setType(type);
    }

    protected void intro() {
        System.out.println("Позицията на " + getType() + " кон e " + getPosition() + ".");
        System.out.println("Кон " + getType() + " се намира на " + checkSquareColor() + " квадрат.");
    }

    protected void takeWithOneMove(ChessPosition enemyFigure) {

        boolean takeWithOneMove = false;

        String position = getPosition();
        String enemyPosition = enemyFigure.getPosition();

        char letter1 = (char) ((position.charAt(0) - 1));
        char number1 = (char) ((position.charAt(1) + 2));

        String path1 = Character.toString(letter1).concat(Character.toString(number1));
        
        char letter2 = (char) ((position.charAt(0) - 1));
        char number2 = (char) ((position.charAt(1) - 2));

        String path2 = Character.toString(letter2).concat(Character.toString(number2));
        
        char letter3 = (char) ((position.charAt(0) - 2));
        char number3 = (char) ((position.charAt(1) + 1));

        String path3 = Character.toString(letter3).concat(Character.toString(number3));
        
        char letter4 = (char) ((position.charAt(0) - 2));
        char number4 = (char) ((position.charAt(1) - 1));

        String path4 = Character.toString(letter4).concat(Character.toString(number4));
        

        char letter5 = (char) ((position.charAt(0) + 1));
        char number5 = (char) ((position.charAt(1) + 2));

        String path5 = Character.toString(letter5).concat(Character.toString(number5));
        
        char letter6 = (char) ((position.charAt(0) + 1));
        char number6 = (char) ((position.charAt(1) - 2));

        String path6 = Character.toString(letter6).concat(Character.toString(number6));
        
        char letter7 = (char) ((position.charAt(0) + 2));
        char number7 = (char) ((position.charAt(1) + 1));

        String path7 = Character.toString(letter7).concat(Character.toString(number7));
        
        char letter8 = (char) ((position.charAt(0) + 2));
        char number8 = (char) ((position.charAt(1) - 1));

        String path8 = Character.toString(letter8).concat(Character.toString(number8));
        
        if (path1.equals(enemyPosition) || path2.equals(enemyPosition) || path3.equals(enemyPosition) || path4.equals(enemyPosition) || path5.equals(enemyPosition) || path6.equals(enemyPosition) || path7.equals(enemyPosition) || path8.equals(enemyPosition)) {

            takeWithOneMove = true;
        }
        
        if (takeWithOneMove == true) {

            System.out.println("\nКон " + getType() + " МОЖЕ да вземе другия с един ход.");
        }

        if (takeWithOneMove == false) {

            System.out.println("\nКон " + getType() + " НЕ МОЖЕ да вземе другия с един ход.");
        }
    }
}
