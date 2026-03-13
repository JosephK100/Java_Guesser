//Joseph Kloepper
//3/13/26
//CS121
//Java guesser 
import java.util.Scanner;

public class Guesser{
	public Guesser(){
		Scanner kb = new Scanner(System.in);
		int choice = -1;
		boolean keepGoing = true
	
		while (keepGoing){
			printMenu();
			choice = kb.nextInt();
			kb.nextLine();

			if (choice == 1){
				humanGuesser();
			}
			else if (choice == 2){
				computerGuesser();
			}
			else if (choice == 0){
				keepGoing = false;
		}
	}
    }
}

	public void printMenu(){
		System.out.println("0) Exit");
		System.out.println("1) Human Guesser");
		System.out.println("2 Computer Guesser");
		System.out.println("Please choose 0-2: ");
	}
	
	public void humanGuesser(){
		//Placeholder stuff
	}
	
	public void computerGuesser(){
		//Placeholder stuff
	}

	public static void main(String[] args){
		new Guesser();
	}

