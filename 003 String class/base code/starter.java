   import java.util.Random;
class starter {
	public static void main(String args[]) {
	Random rand = new Random();
	String one = new String("Happy birthday, to you.");
	String two = new String("Happy birthday dear person");
	String three = new String("Happy birthday, to you");
	
	System.out.println(one);
	System.out.println(two);
	System.out.println(three);
	
    
    
    int rand_1 = rand.nextInt(20);
    int rand_2 = rand_1 + 15;
    System.out.println(rand_2);
    
    
    
    
	
	
	}
}
