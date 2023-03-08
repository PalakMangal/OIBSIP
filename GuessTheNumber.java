import java.util.Scanner;
import java.util.Random;

class Game{
	public int random_num;
	public int guess;
	public int noOfGuesses = 0;
	
	public void setNoOfGuesses(int noOfGuesses) {
		this.noOfGuesses = noOfGuesses;
	}
	
	public int getNoOfGuesses() {
	      return noOfGuesses;
	}
	
	 Game(){
        Random rand = new Random();
        random_num = rand.nextInt(100);
        
	}
	
	 void TakeUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess the number");
		
		guess = sc.nextInt();
	}
	
	 boolean IsCorrectNumber() {
		noOfGuesses++;
	    
		if(guess == random_num ) {
			System.out.format("Yes you get it right , it was %d \nYou guessed in %d chance",guess,noOfGuesses);
		    return true;
		}
		else if( guess < random_num) {
			System.out.println("Too low ...");
		}
		else if(guess > random_num) {
			System.out.println("Too high ...");
		}
		return false;
	}
	 
}

public class GuessTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Game g = new Game();
		
			boolean b = false;
		    while(!b) {
            g.TakeUserInput();
            b = g.IsCorrectNumber();
		    } 
		
		
	}

}

