import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Ascii one=new Ascii();
		one.printArt();
		
		Ascii two=new Ascii("Cactus");
		two.printArt();
		
		Ascii three=new Ascii("Dog", "Jocko");
		three.printArt();
		
		Ascii four=new Ascii("other","Dancer",3);
		four.printArt();
		
		four.setType("other");
		four.setName("Dancer");
		four.setNumber(3);
		four.setAscii("");

		
	}
}
