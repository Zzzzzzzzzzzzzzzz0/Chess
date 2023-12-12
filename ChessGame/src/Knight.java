import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * Knight class "Have-A" relationship with Board class. And "Is-A" relationship with Piece class"
 * This class represent the Black and White Knight piece in ChessGame.
 */
public class Knight extends Piece
{

	//constructor of the Knight class
	public Knight(Board board,int x, int y, Icon image)
	{
		super(board, x, y, image);
	}
	
	//start placing the Knight position
	public void setKnightPosition()
	{
		board.squares[xLocation][yLocation].setIcon(image);
	}

}
