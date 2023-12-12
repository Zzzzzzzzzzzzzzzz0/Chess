import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * Rook class "Have-A" relationship with Board class. And "Is-A" relationship with Piece class"
 * This class represent the Black and White Rook piece in ChessGame.
 */
public class Rook extends Piece
{
	//constructor of the class
	public Rook(Board board,int x, int y, Icon image)
	{
		super(board,x, y, image);
	}
	
	//start placing the Rook 
	public void setRookPosition()
	{
		board.squares[xLocation][yLocation].setIcon(image);
	}

}