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
	
	public String setRole(String role){
		if(r.equals("Wizard")||(r.equals("wizard"))||(r.equals("Rogue"))||(r.equals("rogue"))||(r.equals("Warrior"))||(r.equals("warrior"))){
			System.out.println("You are a "+r);
			return r;
		}
		return "invalid role";
	}
	
	public int setStrength(int a){
		strength = a;
		return strength;
	}
	
	public int setDexterity(int a){
		dexterity=a;
		return dexterity;
	}
	
	public int setIntelligence(int a){
		intelligence=a;
		return intelligence;
	}
	
	public int setConstitution(int a){
		constitution=a;
		return constitution;
	}
	
	public int setCharisma(int a){
		charisma=a;
		return charisma;
	}
	
	public boolean setAll(String a,int b,int c,int d,int e,int f){
		if(a.equals("invalid role")){
			return false;
		}
		else{
			setRole(a);
			setStrength(b);
			setDexterity(c);
			setIntelligence(d);
			setConstitution(e);
			setCharisma(f);
			return true;
		}
	}
}