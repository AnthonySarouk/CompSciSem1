import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int rand_1 = rand.nextInt(1001);
		
		int guess;
		System.out.println("Guess a number between 1-1000");
		guess = sc.nextInt();
		
		if (rand_1 == guess) {
			System.out.println("Correct!");
		}
	    else if (guess < rand_1) {
	    	System.out.println("Smaller than");
	    }
		else if (guess > rand_1) {
			System.out.println("Larger than");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
