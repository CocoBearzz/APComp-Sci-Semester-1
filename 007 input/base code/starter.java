import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name=sc.nextLine();
		
		System.out.println("In what month is your birthday?");
		String month=sc.nextLine();
		
		System.out.println("What day is your birthday?");
		int day=sc.nextInt();
		
		System.out.println("In what year were you born in?");
		int year=sc.nextInt();
		
		System.out.println("How old are you?");
		int age=sc.nextInt();
		
		System.out.println("How much is a buck fifty");
		double price=sc.nextDouble();
	}
}
