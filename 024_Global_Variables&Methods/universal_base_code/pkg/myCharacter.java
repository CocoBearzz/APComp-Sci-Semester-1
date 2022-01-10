package pkg;

public class myCharacter{
	public String r;
	static int strength;
	static int dexterity;
	static int intelligence;
	static int constitution;
	static int charisma;
	public myCharacter(String role){
		r =role;
		
		strength=4;
		dexterity=5;
		intelligence=6;
		constitution=4;
		charisma=6;
	}
	
	public void myToString(){
		System.out.println(r);
		System.out.println("Your strength trait is "+strength);
		System.out.println("Your dexterity trait is "+dexterity);
		System.out.println("Your intelligence trait is "+intelligence);
		System.out.println("Your constitution trait is "+constitution);
		System.out.println("Your charisma trait is "+charisma);
	}
}