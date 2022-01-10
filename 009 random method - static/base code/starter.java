import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Random rand=new Random();
		
		
		int rand_a=rand.nextInt(10);
		int rand_b=rand.nextInt(100)+1;
		double rand_c=rand.nextDouble()+2.5;
		int rand_d=rand.nextInt(575)+14;
		double rand_f=rand.nextDouble();

		System.out.println(rand_a);
		System.out.println(rand_b);
		System.out.println(rand_c);
		System.out.println(rand_d+rand_f);
	}
}
