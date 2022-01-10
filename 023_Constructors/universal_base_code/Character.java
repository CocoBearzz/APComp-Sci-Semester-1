
public class Character{
	String r;
	int strength;
	int dexterity;
	int intelligence;
	int constitution;
	int charisma;
	public Character(String role){
		
		if(role.equals("wizard")||role.equals("Wizard")){
			r=("You chose a wizard");
		}
		else if(role.equals("warrior")||role.equals("Warrior")){
			r=("You chose a warrior");
		}
		else if(role.equals("rogue")||role.equals("Rogue")){
			r=("You chose a rogue");
		}
		else{
			r=("Invalid role... No role");
		}
		
		strength=4;
		dexterity=5;
		intelligence=6;
		constitution=4;
		charisma=6;
	}
	public Character(){
		r="no role";
	}
	public String toString() {
		return r;
	}
}