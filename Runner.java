import java.io.IOException;
import java.util.*;
public class Runner {
	private static Board board;
	private static ArrayList<Card> choices;
	private static GraphicsClass g;
	public static void main(String args[]) throws IOException
	{
		board = new Board();
		g = new GraphicsClass();
		choices = new ArrayList<>();
		setChoices();
		play();
		
	}
	public static void setChoices()
	{
		choices = (board.getCurrentPlayer()).getPlayerHand();
		g.hand(choices);//have this line send the graphics class the hand of cards (choices) in order for the hand to be printed out.
	}
	public static void play()
	{
		while(board.gameRunning())
		{
			int choice = g.getChoice();//gets the card choice from graphics
			board.play(choice);
			setChoices();
		}
		g.setWinner(board.getWinner()); //send the graphics class the player number for displaying it 
	}

}
