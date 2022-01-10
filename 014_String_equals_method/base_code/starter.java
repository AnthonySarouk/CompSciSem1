import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);



	String role;
	System.out.println("Wizard, Warrior or Rogue");
	role = sc.nextLine();
	
    if (role.equals("Wizard") || (role.equals("wizard"))) {
    	System.out.println("You've chosen the role Wizard!");
    }
	
    else if (role.equals("Warrior") || (role.equals("warrior"))) {
		System.out.println("You've chosen the role Warrior!");
	}
	
   else if (role.equals("Rogue") || (role.equals("rogue"))) {
		System.out.println("You've chosen the role Rogue!");
	}
	
	else{
		System.out.println("You've decided not to choose a role.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
