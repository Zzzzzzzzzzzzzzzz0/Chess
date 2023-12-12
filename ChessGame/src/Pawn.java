import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import icons.Icons;


/**
 * Pawn class "Have-A" relationship with Board class. And "Is-A" relationship with Piece class"
 * This class represent the Black and White Bishop piece in ChessGame.
 */
public class Pawn extends Piece {
	
	//constructor of the class
	public Pawn (Board board, int x, int y, ImageIcon image) {
        super(board, x, y, image);
    }

	/**
	 * start placing the pawn position
	 */
    public void setPawnPosition()
    {
		board.squares[xLocation][yLocation].setIcon(image);
    }
	
}