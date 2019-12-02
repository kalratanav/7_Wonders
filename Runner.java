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
		
	}
	public static void setChoices()
	{
		choices = (board.getCurrentPlayer()).getPlayerHand();
	}

}
