import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int base, int power){
			int c=0;
			int product=1;
		while(c<power)
		{
			product*=base;
			c=c+1;
		}
		return product;
	}
	public static void main(String args[]) {
	int a=4;
	int b=2;
	int c=pow(a,b);

	System.out.println(c);



		
	}
}
