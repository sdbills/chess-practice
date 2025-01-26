package chess.MovesCalculators;

import chess.ChessBoard;
import chess.ChessMove;
import chess.ChessPosition;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class KingMovesCalculator extends PiecesMovesCalculator{
    @Override
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition position) {
        var moves = new ArrayList<ChessMove>();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                var newPosition = new ChessPosition(i, j);

            }
        }
        return moves;
    }
}
