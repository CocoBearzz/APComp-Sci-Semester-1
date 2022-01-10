import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	Random rand=new Random();

	int secret=rand.nextInt(1001);
	System.out.println("You have to guess the secret number from 0-1000");
	int guess=sc.nextInt();
	while(true)
	{
		
	
		if(guess!=secret)
			{
				System.out.println("Try again");
				guess=sc.nextInt();
			}
		else if(guess==secret)
			{
				System.out.println("You got it right!");
				break;
			}
	}
		


		
	}
}
