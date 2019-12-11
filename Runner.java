import java.io.IOException;
import java.util.*;
public class Runner {
	private static Board board;
	private static GraphicsClass g;
	private static int playerTurns = 0, age;
	public static void main(String args[]) throws IOException
	{
		board = new Board();
		play();
		
	}
	//graphics
	
	public static void play() {
		System.out.println("ys");
		GraphicsClass g = new GraphicsClass(board.getCurrentAge(), board.getCurrentPlayer(), board.getNextPlayer(), board.getPreviousPlayer());
		while(g.getDecission() == false)
			System.out.print(" ");
		if(g.getDecission() == true) {
			System.out.println("TRUE");
			playerTurns++;
			board.play(g.playerChoice(), g.getPlayed(),g.getBuilt());
			System.out.println(board.getCurrentAge());
			if(board.getCurrentAge() < 4) {		
				if(playerTurns < 18) {
					g.visible();
					play();
				}
				else {
					playerTurns = 0;
					g.visible();
					board.endOfAge();
					play();
				}		
			}
		}
		
	}
	//text
	/* 
	public static void play()
	{
		for(int i = 0 ; i<3; i++)
		{
			for(int k = 0; k<18; k++)
			{
				board.printBoard();
				
			}
			board.endOfAge();
				
			}
			//board.endOfAge();
			
		}*/
		//g.setWinner(board.declareWinner()); //send the graphics class the player number for displaying it 
}
