import java.util.Scanner;
import java.util.Random;

class Character{
	static String r;
	public static int strength;
	public static int dexterity;
	public static int intelligence;
	public static int constitution;
	public static int charisma;
	public Character(String role){
		r =new String(role);
		
		strength=4;
		dexterity=5;
		intelligence=6;
		constitution=4;
		charisma=6;
	}
	
	public String toString() {
		return r;
	}
}

class starter {
	public static void main(String args[]) {
		Character nareg = new Character("wizard");
		System.out.println(nareg);
		
		System.out.println("Strength: "+nareg.strength);
		System.out.println("Dexterity: "+nareg.dexterity);
		System.out.println("Intelligence: "+nareg.intelligence);
		System.out.println("Constitution: "+nareg.constitution);
		System.out.println("Charisma: "+nareg.charisma);
		
		
		
	}
}
