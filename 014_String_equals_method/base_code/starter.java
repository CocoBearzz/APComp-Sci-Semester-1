import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Do you want to be a wizard, warrior, or rogue?");
		String a1=sc.nextLine();
		
		if(a1.equals("wizard"))
		{
			System.out.println("You chose a wizard");
		}
		else if(a1.equals("rogue"))
		{
			System.out.println("You chose a rogue");
		}
		else if(a1.equals("warrior"))
		{
			System.out.println("You chose a warrior");
		}
		else
		{
			System.out.println("You did not choose any of the listed roles");
		}

	}
}
