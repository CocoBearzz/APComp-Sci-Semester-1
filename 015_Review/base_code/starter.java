import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("What is your name?");
	String a=sc.nextLine();
	System.out.println("What is your title?");
	String b=sc.nextLine();
	System.out.println("Choose your role: wizard, rogue, or warrior");
	String a1=sc.nextLine();
	
	int z=25;
	System.out.println("You have 25 points to spend on the following skills with each skill having a max of 10 points:");
	
	System.out.println("Skill 1: Strength - Buff and able to carry larger items");
	System.out.println("Skill 2: Dexterity - Agile and moves quick");
	System.out.println("Skill 3: Intelligence - Better at magic spells!");
	System.out.println("Skill 4: Constitution - How much health");
	System.out.println("Skill 5: Charisma - How personable ");
	
		System.out.println("How many points do you want to spend on your first skill?");
		int n=sc.nextInt();
		int n1=z-n;
		System.out.print("You have "+n1+" points left. ");
		
		System.out.println("How many points do you want to spend on your second skill?");
		int h=sc.nextInt();
		int n2=n1-h;
		System.out.print("You have "+n2+" points left. ");
		
		System.out.println("How many points do you want to spend on your third skill?");
		int r=sc.nextInt();
		int n3=n2-r;
		System.out.print("You have "+n3+" points left. ");
		
		System.out.println("How many points do you want to spend on your fourth skill?");
		int e=sc.nextInt();
		int n4=n3-e;
		System.out.print("You have "+n4+" points left. ");
		
		System.out.println("How many points do you want to spend on your fifth skill?");
		int g=sc.nextInt();
		int n5=n4-g;
		System.out.print("You have "+n5+" points left. ");
		
	
	System.out.println("Your character's name is "+a);
	System.out.println("Your character's title is "+b);
	System.out.println("Your character's role is "+a1);
	System.out.println("Skill one: "+n);
	System.out.println("Skill two: "+h);
	System.out.println("Skill three: "+r);
	System.out.println("Skill four: "+e);
	System.out.println("Skill five: "+g);
	System.out.println("You have "+n5+" points left");
	
	}
}
