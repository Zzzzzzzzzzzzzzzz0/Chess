import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * King class "Have-A" relationship with Board class. And "Is-A" relationship with Piece class"
 * This class represent the Black and White King piece in ChessGame.
 */
public class King extends Piece
{

	//constructor of the class
	public King(Board board,int x, int y, Icon image)
	{
		super(board,x, y, image);
	}
	
	//start placing the King position
	public void  setKingPosition()
	{
		board.squares[xLocation][yLocation].setIcon(image);
	}
	
}
