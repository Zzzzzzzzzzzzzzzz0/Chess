import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import icons.Icons;

//This is the Game Class and it is for starting the game and placing all the chess pieces in specific location.
//This class have "Have-A" relationship with Board class, and "HAS-A" relationship with Pawn,Bishop,Knight,Rook,King,Queen.
public class Game
{
	Board board;
	Pawn blackpawn1,blackpawn2,blackpawn3,blackpawn4,blackpawn5,blackpawn6,blackpawn7,blackpawn8,
		whitePawn1,whitePawn2,whitePawn3,whitePawn4,whitePawn5,whitePawn6,whitePawn7,whitePawn8;
	Bishop whiteBishop1,whiteBishop2,blackBishop1,blackBishop2;
	Knight whiteKnight1,whiteKnight2,blackKnight1,blackKnight2;
	Rook whiteRook1,whiteRook2,blackRook1,blackRook2;
	King whiteKing,blackKing;
	Queen whiteQueen,blackQueen;
	
	//constructor of the class.
	public Game()
	{
		startGame();
	}
	
	/**
	 * Placing all the game pieces in specific location
	 */
	public void startGame()
	{
		board = new Board();
		blackpawn1 = new Pawn(board, 1, 0,Icons.pawnBlack);
		blackpawn1.setPawnPosition();
		blackpawn2 = new Pawn(board, 1, 1,Icons.pawnBlack);
		blackpawn2.setPawnPosition();
		blackpawn3 = new Pawn(board, 1, 2,Icons.pawnBlack);
		blackpawn3.setPawnPosition();
		blackpawn4 = new Pawn(board, 1, 3,Icons.pawnBlack);
		blackpawn4.setPawnPosition();
		blackpawn5 = new Pawn(board, 1, 4,Icons.pawnBlack);
		blackpawn5.setPawnPosition();
		blackpawn6 = new Pawn(board, 1, 5,Icons.pawnBlack);
		blackpawn6.setPawnPosition();
		blackpawn7 = new Pawn(board, 1, 6,Icons.pawnBlack);
		blackpawn7.setPawnPosition();
		blackpawn8 = new Pawn(board, 1, 7,Icons.pawnBlack);
		blackpawn8.setPawnPosition();
	
		whitePawn1 = new Pawn(board, 6, 0,Icons.pawnWhite);
		whitePawn1.setPawnPosition();
		whitePawn2 = new Pawn(board, 6, 1,Icons.pawnWhite);
		whitePawn2.setPawnPosition();
		whitePawn3 = new Pawn(board, 6, 2,Icons.pawnWhite);
		whitePawn3.setPawnPosition();
		whitePawn4 = new Pawn(board, 6, 3,Icons.pawnWhite);
		whitePawn4.setPawnPosition();
		whitePawn5 = new Pawn(board, 6, 4,Icons.pawnWhite);
		whitePawn5.setPawnPosition();
		whitePawn6 = new Pawn(board, 6, 5,Icons.pawnWhite);
		whitePawn6.setPawnPosition();
		whitePawn7 = new Pawn(board, 6, 6,Icons.pawnWhite);
		whitePawn7.setPawnPosition();
		whitePawn8 = new Pawn(board, 6, 7,Icons.pawnWhite);
		whitePawn8.setPawnPosition();
		
		whiteBishop1 = new Bishop(board,7,2,Icons.bishopWhite);
		whiteBishop1.setBishopPosition();
		whiteBishop2 = new Bishop(board,7,5,Icons.bishopWhite);
		whiteBishop2.setBishopPosition();

		blackBishop1 = new Bishop(board,0,2,Icons.bishopBlack);
		blackBishop1.setBishopPosition();
		blackBishop2 = new Bishop(board,0,5,Icons.bishopBlack);
		blackBishop2.setBishopPosition();
		
		whiteKnight1 = new Knight(board,7,1,Icons.knightWhite);
		whiteKnight1.setKnightPosition();
		whiteKnight2 = new Knight(board,7,6,Icons.knightWhite);
		whiteKnight2.setKnightPosition();
		
		blackKnight1 = new Knight(board,0,1,Icons.knightBlack);
		blackKnight1.setKnightPosition();
		blackKnight2 = new Knight(board,0,6,Icons.knightBlack);
		blackKnight2.setKnightPosition();
		
		whiteRook1 = new Rook(board,7,0,Icons.rookWhite);
		whiteRook1.setRookPosition();
		whiteRook2 = new Rook(board,7,7,Icons.rookWhite);
		whiteRook2.setRookPosition();
		
		blackRook1 = new Rook(board,0,0,Icons.rookBlack);
		blackRook1.setRookPosition();
		blackRook2 = new Rook(board,0,7,Icons.rookBlack);
		blackRook2.setRookPosition();
		
		whiteKing = new King(board,7,4,Icons.kingWhite);
		whiteKing.setKingPosition();
		
		blackKing = new King(board,0,4,Icons.kingBlack);
		blackKing.setKingPosition();
		
		whiteQueen = new Queen(board,7,3,Icons.queenWhite);
		whiteQueen.setQueenPosition();
		
		blackQueen = new Queen(board,0,3,Icons.queenBlack);
		blackQueen.setQueenPosition();
	}
	
	/***
	 * This is the main class
	 * @param args
	 */
	public static void main(String[] args)
	{
		new Game();
	}

}
