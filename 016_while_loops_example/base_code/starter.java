import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("What's your name?");
	String a=sc.nextLine();
	System.out.println("How many times do you want to display your name");
	int b=sc.nextInt();
	int c=0;
	
	while(true)
	{
		System.out.println(a);
		c=c+1;
		if(c==b)
		{
			break;
		}
		
	}
		
	}
}
