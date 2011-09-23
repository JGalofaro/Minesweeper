package minesweeper;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Interface extends JFrame {
	
	public static void addComponents(Container thePane, int size, int numBombs)
	{
		/*Container for the buttons composing the game grid */
		JButton gameGrid[][] = new JButton[size][size];
		/* Labels to detail: Score, # of bombs left, # of bombs detonated */
		JLabel score, bombsRemaning;
		
		for(int i = 0; i < size; i++)
			for(int j = 0; j < size; j++)
				gameGrid[i][j] = new JButton();
		
		thePane.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		/* number of bombs left */
		bombsRemaning = new JLabel("Number of Bombs Remaing: " + numBombs);
		c.fill = GridBagConstraints.VERTICAL;
		c.weightx = 0.5;
		c.weighty = 0.1;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 0;
		c.ipadx = 10;
		thePane.add(bombsRemaning, c);
		
		/**JButton button = new JButton("Button 1x0");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 2;
		c.gridx = 1;
		c.gridy = 0;
		thePane.add(button, c);**/
		
		/**JTextField text = new JTextField("THE TEXT");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 3;
		c.ipady = 40;
		c.gridx = 0;
		c.gridy = 1;
		thePane.add(text, c);**/
		
		JPanel gridPanel = new JPanel(new GridLayout(size, size));
		for(int i = 0; i < size; i++)
			for(int j = 0; j < size; j++)
				gridPanel.add(gameGrid[i][j]);
		
		c.fill = GridBagConstraints.BOTH;
		c.gridwidth = 3;
		c.weightx = 0.5;
		c.weighty = 1;
		c.anchor = GridBagConstraints.PAGE_END;
		c.ipadx = 20;
		c.ipady = 20;
		c.gridx = 0;
		c.gridy = 1;
		thePane.add(gridPanel, c);
		/**
		contentPane.add(new JLabel("Label A"));
		contentPane.add(new JButton("Button A"));
        contentPane.add(new JCheckBox("JCheckBox 3"));
        contentPane.add(new JTextField("Long-Named JTextField 4"));
        contentPane.add(new JButton("JButton 5"));
        **/
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
				return new Dimension(500, 500);
			}
		};
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addComponents(frame.getContentPane(), size, bombNum);
		
		frame.pack();
		frame.setResizable(true);
		//frame.setSize(500, 500);
		//frame.setM
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
