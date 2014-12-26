package exercise_1_2;

public class ChessBoard {

    protected static void printBoard(ChessPosition figure1, ChessPosition figure2) {

        String[][] chessArray = new String[8][8];

        int number = chessArray.length;

        for (String[] elements : chessArray) {

            elements[0] = "a".concat(Integer.toString(number));
            elements[1] = "b".concat(Integer.toString(number));
            elements[2] = "c".concat(Integer.toString(number));
            elements[3] = "d".concat(Integer.toString(number));
            elements[4] = "e".concat(Integer.toString(number));
            elements[5] = "f".concat(Integer.toString(number));
            elements[6] = "g".concat(Integer.toString(number));
            elements[7] = "h".concat(Integer.toString(number));

            number--;
        }

        System.out.println("\n-----------------------------------------");

        for (String[] rows : chessArray) {

            for (String column : rows) {

                String getColor = column.replace(figure1.getPosition(), "\u001B[31m" + figure1.getPosition() + "\u001B[0m");

                getColor = getColor.replace(figure2.getPosition(), "\u001B[31m" + figure2.getPosition() + "\u001B[0m");

                System.out.print("| " + getColor + " ");
            }

            System.out.println("|");
            System.out.println("-----------------------------------------");
        }
    }
}
