//Joseph Kloepper
//3/13/26
//CS121
//Java guesser 
import java.util.Scanner;

public class Guesser{
	public Guesser(){
		Scanner kb = new Scanner(System.in);
		int choice = -1;
		boolean keepGoing = true;
	
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
		System.out.println("Please enter 0-2: ");
	}
	
	public void humanGuesser(){
		int guesses = 0;
		int userGuess = 0;
		int answer = (int)(Math.random() * 100) + 1;
		System.out.println("Let's play a guessing game.");
		
		boolean correct = false;
		while (guesses < 7 && !correct){
			System.out.print("What is your guess? : ");
			userGuess = kb.nextInt();

			if (userGuess < answer){
				System.out.println("That's too low.");
			} else if (userGuess > answer){
				System.out.println("That's too high.");
			} else { 
				System.out.println("You got it!!");
				correct = true;
			}
			guesses++;
		}
		if (!correct){
			System.out.println("You're out of guesses.");
		}	
	}
	
	public void computerGuesser(){
		int low = 1;
		int high = 100;
		int attempt = 0;
		boolean correct = false;

		while (attempt < 7 && !correct){
			int guess = (low + high) / 2;
			System.out.println("I guess " + guess + ".");
			System.out.print("Is your number (H)igher, (L)ower, or (C)orrect? ");
			String response = kb.next().toUpperCase();

			if (response.equals("H")){
				low = guess + 1;
			} else if (response.euals("L")){
				high = guess - 1;
			} else if (response.equals("C")){
				System.out.println("I got it!");
				correct = true;
			}
			
			attempts++;
		}
		if (!correct){
			System.out.println("I'm out of guesses.");
		}
	}

	public static void main(String[] args){
		new Guesser();
	}

