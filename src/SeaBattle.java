import java.util.Scanner;

public class SeaBattle {

	private int amountOfPlayers;
	
	public void play() {
		System.out.println("Hoeveel spelers spelen? (1 of 2)");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				int input = Integer.parseInt(sc.nextLine());
				if(input < 0 || input > 2) {
					System.out.println("Graag een valide aantal spelers ingeven.");
				}else {
					amountOfPlayers = input;
					break;
				}
			}catch(Exception e){
				System.out.println("Graag 1 of 2 invullen.");
			}
		}
		
		System.out.println("ENDE");
	}
	
}
