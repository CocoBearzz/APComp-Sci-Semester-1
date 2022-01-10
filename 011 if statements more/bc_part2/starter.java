C

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Type in your first number");
		int a1=sc.nextInt();
		System.out.println("Type in your second number (Make sure it is less than the first)");
		int a2= sc.nextInt();
		System.out.println("Type in your third number(Make sure it is less than the second)");
		int a3= sc.nextInt();
		
		boolean x1=((a1>a3)&&(a2>a3)&&(a1>a2));
		
		if(x1)
		{
			System.out.println(a1);
		}
		
		boolean x2=((a3<a1)&&(a3<a2)&&(a2<a1));
		
		if(x2)
		{
			System.out.println(a3);
		}
		
	}
}
