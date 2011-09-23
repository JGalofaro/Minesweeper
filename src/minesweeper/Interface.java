package minesweeper;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interface extends JFrame {
	
	public static void addComponents(Container contentPane)
	{
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("Label A"));
		contentPane.add(new JButton("Button A"));
        contentPane.add(new JCheckBox("JCheckBox 3"));
        contentPane.add(new JTextField("Long-Named JTextField 4"));
        contentPane.add(new JButton("JButton 5"));
	}
	
	/**
	 * Constructor
	 * @param size - Size of the game board 
	 * @param bombNum - Number of bombs to be placed
	 */
	Interface(int size, int bombNum)
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		JFrame frame = new JFrame("24 hour challenge #1 - Minesweeper")
		{
			public Dimension getMinimumSize()
			{
				Dimension preferredSize = getPreferredSize();
				return new Dimension(100, preferredSize.height);
			}
		};
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addComponents(frame.getContentPane());
		
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
		
		/**
		JLabel guiLeft = new JLabel("This is the left side.");
		JLabel guiRight = new JLabel("This is the right side.");
		
		JLayout 
		add(guiHelloWorld);
		this.setSize(500, 500);
		this.setTitle("24 Hour Challenge #1 - Minesweeper");
		setVisible(true);
		**/
	}

}
