import java.util.Scanner;

class starter {
	public static int Multiply(int a,int b){
		int c=a;
		int d=b;
		int product=c*d;
		if(product%3==0){
			return product;
			}
		else{
			return 0;
			}
	}
	
	
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Choose a number");
	int a=sc.nextInt();
	
	System.out.println("Choose a second number");
	int b=sc.nextInt();
	
	int c=Multiply(a,b);
	System.out.println(c);
		
		
	}
}
