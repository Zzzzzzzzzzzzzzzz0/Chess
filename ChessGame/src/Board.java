import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Stack;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;	

//This is the Board class and it has "IS-A" relationship with JFrame.
public class Board extends JFrame
{
		//instance variables of the Board class
	    public JButton[][] squares;
	    private final int numRows = 8;
	    private final int numCols = 8;
	   
	    //constructor of the class
	    public Board()
	    {
	    	//This is for the game Panel
	    	JPanel gamePanel = new JPanel();
	    	//2D array for game buttons
	        squares = new JButton[numRows][numCols];
	        //using grid layout for the Game Board
			gamePanel.setLayout(new GridLayout(numRows,numCols));
			//creating button in 8*8 grids and changing color
			for (int x = 0; x < numRows; x++)
	        {
	            for (int y = 0; y < numCols; y++)
	            {
	                squares[x][y] = new JButton();

	                gamePanel.add(squares[x][y]);
	                if((x + y) % 2 == 0)
					{
						squares[x][y].setBackground(new Color(228,158,119));
					}
					else
					{
						squares[x][y].setBackground(new Color(161,102,47));
					}
	            }
	        }
			
			add(gamePanel);					//adding the gamePanel to the Frame
			setTitle("Chess Game");			//setting the Title
			setSize(1000,800);				//setting size
			setResizable(false);		
			setVisible(true);
	    }	
}
	
