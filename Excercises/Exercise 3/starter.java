import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("Choose a number");
		int a=sc.nextInt();
		 int c=a;
		
		while(true)
		{
			c=c+1;
			System.out.println(c);
			if (c==a+5)		
			{
				break;
			}
		}
		
	}
}
