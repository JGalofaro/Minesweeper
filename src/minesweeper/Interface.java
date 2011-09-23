package minesweeper;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Interface extends JFrame {
	
	/**
	 * I'm not sure what this is. - 2:08
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor
	 * @param size - Size of the game board 
	 * @param bombNum - Number of bombs to be placed
	 */
	Interface(int size, int bombNum)
	{
		JLabel guiHelloWorld = new JLabel("Hello, World");
		add(guiHelloWorld);
		this.setSize(100, 100);
		setVisible(true);
	}

}
