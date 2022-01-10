import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Type your first number");
		int a=sc.nextInt();
		
		System.out.println("Type your second number");
		int b=sc.nextInt();
		
		boolean c=a>b;
		
		if(c==true)
		{
			System.out.println("Goodjob");
		} 
	
	}
}
