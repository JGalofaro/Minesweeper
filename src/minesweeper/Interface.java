package minesweeper;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interface extends JFrame {
	
	public static void addComponents(Container thePane)
	{
		thePane.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		thePane.add((new JLabel("Grid 0x0")), c);
		
		JButton button = new JButton("Button 1x0");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 2;
		c.gridx = 1;
		c.gridy = 0;
		thePane.add(button, c);
		
		JTextField text = new JTextField("THE TEXT");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 3;
		c.ipady = 40;
		c.gridx = 0;
		c.gridy = 1;
		thePane.add(text, c);
		
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
