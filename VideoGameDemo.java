import java.util.Scanner;

public class VideoGameDemo {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Are you a Dev or a Player: ");
	String person = sc.nextLine();
	if (person.equals("Dev")) {
	    GameDev dev = new GameDev();
	    dev.editGame();
	}
	else if (person.equals("Player")) {
	    GamePlayer player = new GamePlayer();
	    player.playGame();
	}
	sc.close();
    }
}	
