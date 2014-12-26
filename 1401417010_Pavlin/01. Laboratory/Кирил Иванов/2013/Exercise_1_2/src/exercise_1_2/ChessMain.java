package exercise_1_2;

public class ChessMain {

    public static void main(String[] args) {

        ChessKnight chessKnightWhite = new ChessKnight("d4", "бял");

        chessKnightWhite.intro();

        ChessKnight chessKnightBlack = new ChessKnight(InputValidation.inputValidation(), "черен");

        chessKnightBlack.intro();

        chessKnightWhite.takeWithOneMove(chessKnightBlack);
        chessKnightBlack.takeWithOneMove(chessKnightWhite);

        ChessBoard.printBoard(chessKnightWhite, chessKnightBlack);
    }
}
