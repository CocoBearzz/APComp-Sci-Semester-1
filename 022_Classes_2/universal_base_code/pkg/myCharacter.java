package pkg;

public class myCharacter{
	public String r;
	int strength;
	int dexterity;
	int intelligence;
	int constitution;
	int charisma;
	public myCharacter(String role){
		r =role;
		
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