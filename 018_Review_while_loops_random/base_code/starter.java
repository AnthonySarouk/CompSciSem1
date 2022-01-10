import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
	
		int guess;
		System.out.println("Guess a number between 1-1000: ");
		guess = sc.nextInt();
		
		int rand_1;
		rand_1 = rand.nextInt(1001);
		
	
	    
		while(true) {
		if(guess == rand_1){
			System.out.println("Correct!");
			break;
				}
		
		else if(guess > 1000) {
			System.out.println("Please input a smaller guess");
			guess = sc.nextInt();
		}
		
		else {
			System.out.println("Guess again");
			guess = sc.nextInt();
		}
		
	}
	



		
	}
}
