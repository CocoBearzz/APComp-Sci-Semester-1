import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Type a 3 letter word");
		String a=sc.nextLine();
		
		for(int c=0;c<a.length();c++){
			System.out.println(a.substring(c,c+1));
		}


		
	}
}
