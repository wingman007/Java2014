package exercise_1_1;

public class ChessMain {

    public static void main(String[] args) {

        ChessOfficer chessOfficerWhite = new ChessOfficer("d4", "бял");
        
        chessOfficerWhite.intro();
        
        
        ChessOfficer chessOfficerBlack = new ChessOfficer(InputValidation.inputValidation(), "черен");
        
        chessOfficerBlack.intro();
        
        chessOfficerWhite.takeWithOneMove(chessOfficerBlack);
        chessOfficerBlack.takeWithOneMove(chessOfficerWhite);
        
        ChessBoard.printBoard(chessOfficerWhite, chessOfficerBlack);
    }
}
