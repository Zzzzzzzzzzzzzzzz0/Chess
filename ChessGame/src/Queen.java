import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 * Queen class "Have-A" relationship with Board class. And "Is-A" relationship with Piece class"
 * This class represent the Black and White Queen piece in ChessGame.
 */
public class Queen extends Piece
{
	//constructor of the class
	public Queen(Board board,int x, int y, Icon image)
	{
		super(board,x, y, image);	
	}
	
	/**
	 * start placing the queen position
	 */
	public void setQueenPosition()
	{
		board.squares[xLocation][yLocation].setIcon(image);
	}
	
}
