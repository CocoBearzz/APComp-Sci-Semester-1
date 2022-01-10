import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("What is a pet peeve of yours?");
		String a=sc.nextLine();
		
		String r="According to your answer, \nyour pet peeve is \""+a+ "\"";
		System.out.println(r);
		
		String r1="I also \t have multiple pet \\ peeves";
		System.out.println(r1);
		
		String r2="One of my biggest \bpet peeves is when \f people eat loud";
		System.out.println(r2);
		
		


		
	}
}
