import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * Bishop class "Have-A" relationship with Board class. And "Is-A" relationship with Piece class"
 * This class represent the Black and White Bishop piece in ChessGame.
 */
public class Bishop extends Piece
{
	//constructor of the Bishop class
	public Bishop(Board board,int x, int y, ImageIcon image)
	{
		super(board,x, y, image);
	}
	
	//start placing the Bishop 
    public void setBishopPosition()
    {
		board.squares[xLocation][yLocation].setIcon(image);
    }
}
