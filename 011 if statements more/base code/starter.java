import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		System.out.println("Int variables");
		a = sc.nextInt();
		
		int b;
		System.out.println("Second int variable");
		b = sc.nextInt();
	     if (a == b) {
			
			System.out.println("Equal");
			
			}
		
		if (a != b) {
			System.out.println("Not equal");
		}
		
		int c;
		System.out.println("Third int variable");
		c = sc.nextInt();
		
		int d;
		System.out.println("Fourth int variable");
		d = sc.nextInt();
		
		int e;
		System.out.println("Fifth int variable");
		
		e = sc.nextInt();
		
		if ((c < d)  && (c < e)) {
			System.out.println("Smallest Integer");
			System.out.println(c);
		}
		
		if ((d < c) && (d < e)) {
			System.out.println("Smallest Integer");
			System.out.println(d);
		}
		
		if ((e < c) && (e < d)) {
			System.out.println("Smallest Integer");
			System.out.println(e);
		}
		
		
		if ((c > d) && (c > e)) {
			System.out.println("Largest Integer");
			System.out.println(c);
		}
		
		if ((d > c) && (d > e)) {
			System.out.println("Largest Integer");
			System.out.println(d);
		}
		
		if ((e > c) && (e > d)) {
			System.out.println("Largest Integer");
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
