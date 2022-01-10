import java.util.Scanner;

class Cat{
	public static String name=new String();
	
	public Cat(){
		name="Garfield";
	}
	
	public Cat(String a){
		name=a;
	}
	
	public static void Meow(){
		System.out.println(name+": meow");
	}
}

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Choose a cat");
		String a=sc.nextLine();
		
		Cat g=new Cat(a);
		g.Meow();
		
		Cat h=new Cat();
		h.Meow();
		
		
		
	}
}
