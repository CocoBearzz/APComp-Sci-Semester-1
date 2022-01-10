import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		Random rand=new Random();
		
		int c=rand.nextInt(1000)+1;
		
		System.out.println("Guess a number from 1-1000");
		int a=sc.nextInt();
		
		if(a==c)
		{
			System.out.println("You guessed right");
		}
		else if(a>c)
		{
			System.out.print("Your guess is larger than the number");
		}
		else if(a<c)
		{
			System.out.println("Your guess is smaller than the number");
		}
	}
}
