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
			Player player = board.getPrevPlayer();
			g.setCoins(player.getNumCoins());//send amount of coins
			g.point(player.getMilitaryVictories(), player.getMilitaryDefeats(), player.getMilitaryPoints(), player.getVictoryPoints()); // send military stuff
			g.
			setChoices();
		}
		g.setWinner(board.getWinner()); //send the graphics class the player number for displaying it 
	}

}
