import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import icons.Icons;


/**
 * Piece class "Have-A" relationship with Board class. And "Is-A" relationship with King,Queen,Knight,Bishop,Rook and pawn class"
 * This class represent the Black and White pieces in ChessGame.
 */

public abstract class Piece extends JButton
{
	public int xLocation;
	public int yLocation;
	public Icon image;
	static Board board;
	//constructor of the class
	public Piece() {}
	public Piece(Board board, int x, int y, Icon image) {
		xLocation = x;
		yLocation = y;
		this.board = board;
		this.image = image;
	}
	
	
}
