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

    protected void takeWithOneMove(ChessPosition enemyChessOfficer) {

        boolean takeWithOneMove = false;

        String position = getPosition();
        String enemyPosition = enemyChessOfficer.getPosition();



        char letter = (char) ((position.charAt(0) + 2));
        char number = (char) ((position.charAt(1) + 1));

        String rightUpString = Character.toString(letter).concat(Character.toString(number));
        
        letter = (char) ((position.charAt(0) + 2));
        number = (char) ((position.charAt(1) + 1));

        rightUpString = Character.toString(letter).concat(Character.toString(number));
        
        char rightDownLetter = (char) ((position.charAt(0) + 2));
        char rightDownNumber = (char) ((position.charAt(1) - 1));

        String rightDownString = Character.toString(rightDownLetter).concat(Character.toString(rightDownNumber));

        char leftUpLetter = (char) ((position.charAt(0) + 1));
        char leftUpNumber = (char) ((position.charAt(1) - 2));

        String leftUpString = Character.toString(leftUpLetter).concat(Character.toString(leftUpNumber));

        char leftDownLetter = (char) ((position.charAt(0) - 1));
        char leftDownNumber = (char) ((position.charAt(1) - 2));

        String leftDownString = Character.toString(leftDownLetter).concat(Character.toString(leftDownNumber));


        if (position.equals(rightUpString) || position.equals(rightDownString) || position.equals(leftUpString) || position.equals(leftDownString)) {

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
