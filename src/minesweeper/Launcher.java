package minesweeper;
import java.util.*;

/** 
 * @author Josh Galofaro
 * @date 09/23/2011
 * 
 * 24 Hour Challenge #1  -  Minesweeper Clone
 */
public class Launcher {

	public static void main( String[] args )
	{
		int boardSize = 6, numOfBombs = 0;
		if( args.length >= 0 )
		{
			boardSize = Integer.parseInt(args[0]);
			numOfBombs = Integer.parseInt(args[1]);
		}
		
		/** DEBUG PURPOSES **/
		System.out.println("Size of Board: " + boardSize);
		System.out.println("Number of Bombs: " + numOfBombs);
		
		/* Check that board size is above the minimum of 6x6 */
		if( boardSize < 6 )
		{
			System.out.println("Warning: Minimum board size is 6x6," +
					" entered size is smaller than the minimum and will" +
					" be changed.");
			boardSize = 6;
		}
		
		/* Check that the number of bombs does not exceed number of spots */
		if( numOfBombs > (boardSize*boardSize) || numOfBombs <= 0 )
		{
			System.out.println("Fatal Warning: The number of bombs placed " +
					"either exceeds the number of spots on the board or is " +
					"smaller than 1. Program will be exterminated.");
			System.exit(0);
		}
		
		/** DEBUG PURPOSES **/
		System.out.println("All checks have passed.");
	}
}
