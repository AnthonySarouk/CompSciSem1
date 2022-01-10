import java.util.Scanner;


class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	
	String name;
	System.out.println("What is your name?");
	name = sc.nextLine();
    
	String title;
	System.out.println("What will be your title? ex: Slayer of Dragons");
	title = sc.nextLine();

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
	
	else {
		System.out.println("You've decided not to choose a role. Please pick a role to continue");
		role = sc.nextLine();
	}
	
	
	System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely");
	int Points = 25;
	int Strength;
	System.out.println();
	System.out.print("Strength (1-10): ");
	Strength = sc.nextInt();
	
	while (true) {
	if (Strength <= 10) {
	    
	    int Points2 = Points - Strength;
		String Left = Integer.toString(Points2);
		System.out.print("You have " + Left);  System.out.println(" skill points left to spend");
	    break;
	}
	else {
		System.out.println("Please input a smaller value");
		Strength = sc.nextInt();
	  
	}
	}
	
	int Points2 = Points - Strength;
	int Dexterity;
	System.out.println();
	System.out.print("Dexterity (1-10): ");
	Dexterity = sc.nextInt();
   
	while (true) {
	if (Dexterity <= 10)  {
	
		int Points3 = Points2 - Dexterity;
		String Left2 = Integer.toString(Points3);
		System.out.print("You have " + Left2);  System.out.println(" skill points left to spend");
        break;
	}
	else {
		System.out.println("Please input a smaller value");
		Dexterity = sc.nextInt();
	}
	}
	 
	
	 int Points3 = Points2 - Dexterity;
     int Intelligence;
     System.out.println();
     System.out.print("Intelligence (1-10): ");
     Intelligence = sc.nextInt();
   
     while (true) {
     if(Intelligence <= Points3)  {
      	int Points4 = Points3 - Intelligence;
    	String Left3 = Integer.toString(Points4);
    	System.out.print("You have " + Left3);  System.out.println(" skill points left to spend");
        break;
    }
    else    {
    System.out.println("Please input a smaller value");
    Intelligence = sc.nextInt();
    }
     }
		
	int Points4 = Points3 - Intelligence;
	int Constitution;
    System.out.println();
	System.out.print("Constitution (1-10): ");
	Constitution = sc.nextInt();
	while (true)  {
	if (Constitution <= Points4)   {
		int Points5 = Points4 - Constitution;
		String Left4 = Integer.toString(Points5);
		System.out.print("You have " + Left4);  System.out.println(" skill points left to spend");
		break;
	}
	else {
		System.out.println("Please input a smaller value");
		Constitution = sc.nextInt();
		
	}
     	}
	int Points5 = Points4 - Constitution;
	int Charisma = 9999;
    System.out.println();
	System.out.print("Charisma (1-10): ");
	Charisma = sc.nextInt();
	while (true) {
    if (Charisma <= Points5)  {
    	int Points6 = Points5 - Charisma;
    	String Left5 = Integer.toString(Points6);
    	System.out.print("You have " + Left5);  System.out.println(" skill points left to spend");
        break;
    }
    	 
	else {
		System.out.println("Please input a smaller value");
		Charisma = sc.nextInt();
		
	}
	}
	
	
	System.out.println();
	System.out.println("--------------------------------------------");
	
	System.out.print("You are "  +  name);  System.out.print(","); System.out.print(" " + title);  System.out.println(".");
	System.out.print("You're a " + role); System.out.println(" with the following stats!");
	System.out.println("Strength: " + Strength);
    System.out.println("Dexterity: " + Dexterity);
	System.out.println("Intelligence: " + Intelligence);
	System.out.println("Constitution: " + Constitution);
	System.out.println("Charisma: " + Charisma);
	



    System.out.println();
    System.out.println();
	System.out.println();
	System.out.println();
	System.out.print("Good luck on your quest " + name);  System.out.print("!");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
