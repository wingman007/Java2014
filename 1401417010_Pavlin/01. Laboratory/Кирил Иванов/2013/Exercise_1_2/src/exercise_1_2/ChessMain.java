package exercise_1_2;

public class ChessMain {

    public static void main(String[] args) {

        ChessKnight chesKnightWhite = new ChessKnight("d4", "бял");

        chesKnightWhite.intro();

        ChessKnight chessKnightBlack = new ChessKnight(InputValidation.inputValidation(), "черен");

        chessKnightBlack.intro();

        chesKnightWhite.takeWithOneMove(chessKnightBlack);
        chessKnightBlack.takeWithOneMove(chesKnightWhite);

        ChessBoard.printBoard(chesKnightWhite, chessKnightBlack);
    }
}
