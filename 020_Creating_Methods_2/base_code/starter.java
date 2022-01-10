import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int x = 5;
		int y = 5;
		int counter = 1;
		int result;
		while(true) {
			result = x << y;
			if(counter == y) {
				break;
			}
    	counter = counter + 1;
		}
		System.out.println(result);
		
		
		System.out.println(5 << 5);
		
	}
     


		
	}

