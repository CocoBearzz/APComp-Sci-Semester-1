import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand=new Random();
		int[] array=new int[1000];
		int c=0;
		
		while(c<array.length){
			int r=rand.nextInt(1000);
			array[c]=r;
			System.out.println(array[c]);
			c++;
		}
		
	}
}
