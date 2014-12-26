package exercise_1_1;

public class ChessMain {

    public static void main(String[] args) {

        ChessBishop chessBishopWhite = new ChessBishop("d4", "бял");
        
        chessBishopWhite.intro();
        
        
        ChessBishop chessBishopBlack = new ChessBishop(InputValidation.inputValidation(), "черен");
        
        chessBishopBlack.intro();
        
        chessBishopWhite.takeWithOneMove(chessBishopBlack);
        chessBishopBlack.takeWithOneMove(chessBishopWhite);
        
        ChessBoard.printBoard(chessBishopWhite, chessBishopBlack);
    }
}
