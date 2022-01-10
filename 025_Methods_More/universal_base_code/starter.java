import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		myCharacter sosaMan=new myCharacter("");
		sosaMan.setRole("wizard");
		sosaMan.setStrength(5);
		sosaMan.setDexterity(4);
		sosaMan.setIntelligence(8);
		sosaMan.setConstitution(6);
		sosaMan.setCharisma(4);
		sosaMan.setAll("wizard",5,4,8,6,4);
		sosaMan.myToString();
		
		


		
	}
}
