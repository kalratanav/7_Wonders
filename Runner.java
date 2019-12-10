import java.io.IOException;
import java.util.*;
public class Runner {
	private static Board board;
	//private static ArrayList<Card> choices;
	private static GraphicsClass g;
	public static void main(String args[]) throws IOException
	{
		board = new Board();
		g = new GraphicsClass();
		//choices = new ArrayList<>();
		//setChoices();
		play();
		
	}
	/*public static void setChoices()
	{
		choices = (board.getCurrentPlayer()).getPlayerHand();
	//	g.hand(choices);//have this line send the graphics class the hand of cards (choices) in order for the hand to be printed out.
	}*/
	public static void play()
	{
		for(int i = 0 ; i<3; i++)
		{
			for(int k = 0; k<18; k++)
			{
				Player player = board.getPreviousPlayer();
				g.setAge(board.getCurrentAge());
				g.setCurrentPlayer(player); //send player object
				Player nextPlayer = board.getCurrentPlayer();
				g.setNextPlayer(nextPlayer);
				Player PrevPlayer = board.getNextPlayer();
				g.setPreviousPlayer(PrevPlayer);
				if(g.getDecission()) {
					int choice = g.playerChoice();//gets the card choice from graphics
					board.play(choice, g.getPlayed(), g.getBuilt());
				}
				
			}
			board.endOfAge();
		}
		g.setWinner(board.declareWinner()); //send the graphics class the player number for displaying it 
	}

}
