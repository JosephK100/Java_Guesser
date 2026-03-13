//Joseph Kloepper
//3/13/26
//CS121
//Java guesser 
import java.util.Scanner;

public class Guesser{
	//Scanner for all input
	Scanner kb = new Scanner(System.in);
	/*
	 * My constructor, which displays menu and processes user choices.
	 * Loops until user chooses to exit.
	 */
	public Guesser(){
		Scanner kb = new Scanner(System.in);
		int choice = -1;
		boolean keepGoing = true;
		
		//Java version of keepGoing
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
				keepGoing = false; //Exit the program loop.
		}
	}
    }
	/*
	 * Prints the menu options (0-2)
	 */
	public void printMenu(){
		System.out.println("0) Exit");
		System.out.println("1) Human Guesser");
		System.out.println("2 Computer Guesser");
		System.out.println("Please enter 0-2: ");
	}
	/*
	 * For the human guesser:
	 * The computer picks a random number from 1-100
	 * The user has 7 chances to guess it.
	 */
	public void humanGuesser(){
		int guesses = 0;
		int userGuess = 0;
		int answer = (int)(Math.random() * 100) + 1;
		System.out.println("Let's play a guessing game.");
		
		boolean correct = false;
		//User gets up to 7 guesses
		while (guesses < 7 && !correct){
			System.out.print("What is your guess? : ");
			userGuess = kb.nextInt();

			//Feedback for the user 
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
	/*
	 * Computer guesser
	 * H = The guess is too high
	 * L = The guess is too low
	 * C = The guess is correct
	 */
	public void computerGuesser(){
		int low = 1;
		int high = 100;
		int attempt = 0;
		boolean correct = false;

		//Computer also gets up to 7 attempts
		while (attempt < 7 && !correct){
			//Guesses the midpoint of the current range
			int guess = (low + high) / 2;
			System.out.println("I guess " + guess + ".");
			System.out.print("Is your number (H)igher, (L)ower, or (C)orrect? ");
			String response = kb.next().toUpperCase();

			//Changes the guess range based on user feedback
			if (response.equals("H")){
				low = guess + 1;//Too low
			} else if (response.equals("L")){
				high = guess - 1;//Too high
			} else if (response.equals("C")){
				System.out.println("I got it!");//Guessed correctly
				correct = true;
			}
			
			attempt++;
		}
		if (!correct){
			System.out.println("I'm out of guesses.");
		}
	}

	//Main method
	public static void main(String[] args){
		new Guesser();
	}
}
