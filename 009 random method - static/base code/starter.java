import java.util.Random;

class starter {
	public static void main(String args[]) {
Random rand = new Random();
int rand_1 = rand.nextInt(10);
System.out.println("Random integers:"+ rand_1);

int rand_2 = rand.nextInt(100);
rand_2 = rand_2 + 1;
System.out.println("Random ints:" + rand_2);

double double_1 = rand.nextDouble();
double_1 = double_1 + 2.5;
System.out.println("Random doubles:"+ double_1);

double double_2 = rand.nextDouble();
double_2 = double_2 + 14;
int rand_3 = rand.nextInt(575);
double_2 = double_2 + rand_3;
System.out.println("Random double:"+ double_2);








	}
 }
