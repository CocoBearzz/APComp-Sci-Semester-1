import pkg.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


class starter {
	public static void main(String args[]) throws FileNotFoundException {
        File text = new File("./test.txt");
     
        Scanner sc = new Scanner(text);
     
        int lineNumber = 1;

        while(sc.hasNextLine()){
            String line=sc.nextLine();
            for(int x=0;x<line.length();x++){
                String letter=line.substring(x,x+1);
                if(x%2==0){
                    letter=letter.toLowerCase();
                }
                else if(x%2!=0){
                    letter=letter.toUpperCase();
                }
                System.out.print(letter);
            }
            System.out.println();
        }
	}
}
