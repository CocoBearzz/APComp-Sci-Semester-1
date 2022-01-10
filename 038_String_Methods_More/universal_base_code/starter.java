import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Type your first and last name");
		String name=sc.nextLine();

		System.out.println(name.substring(name.indexOf(" ")));


		
	}
}
