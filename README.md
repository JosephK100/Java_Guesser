# Java_Guesser
-Pseudocode/Algorithm-
```
-Menu/Main Loop-
    Display a menu that gives the user three options:
        0: Exit
        1: Human Guess
        2: Computer Guess
    If choice = 0:
        End loop.
    Else if choice = 1:
        Initiate the human guessing game.
        Call humanGuesser()
    Else if choice = 2:
        Inititate the computer guessing game.
        Call computerGuesser()
    Loop until the user enters 0.
    End loop.

Human Guesser
    Generate a random number between 1 and 100.
    Set guesses = 1
    Loop until guess is correct:
        Prompt the user that they only have so and so guesses. (I'll do the basic 7)
        Read the guess.
        
        If guess < answer:
            Print "Too low"
        Else if guess > answer:
            Print "Too high"
        Else:
            Print "You got it!"
        guess = guess + 1
        If guesses > 7:
             End loop. 
Computer Guesser
    Set low = 1
    Set high = 100
    Set attempt = 1

    Loop until correct or attempt > 7
        guess = (low + high) / 2
        Print "I guess (guess)"
        Promt the user with "(H)igh, (L)ow or (C)orrect?"
        Process the response.
        
        If response is H:
            high = guess -1
        Else if response is L:
            low = guess +1
        Else if response is C:
            Print "I got it!"
            End loop.
        attempt = attempt + 1
    End Loop.
    If attempt > 7:
        Print "I ran out of guesses."
```
