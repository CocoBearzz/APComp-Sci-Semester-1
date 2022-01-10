import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.println("The values are: "+a[i]);
		}
	}
	public static int getArrayAverage(int[]a){
		int t=0;
		
		for(int i=0;i<a.length;i++){
			t=t+a[i];
		}
		int avg=t/a.length;
		return avg;
	}
	public static int getMin(int[]a){
		int min=1000;
			
		for(int i=0;i<a.length;i++){
			if(a[i]<min){
				min=a[i];
			}
		}
		return min;
	}
	public static int getMax(int[]a){
		int max=-1;
			
		for(int i=0;i<a.length;i++){
			if(a[i]<max){
				max=a[i];
			}
		}
		return max;
	}
	
	public static void main(String args[]) {
		Random rand=new Random();
		int[] array=new int[100];
		
		for(int i=0;i<array.length;i++){
			int r=rand.nextInt(100)+1;
			array[i]=r;
		}
		
		toStringArray(array);
		System.out.println(getArrayAverage(array));
		System.out.println(getMin(array));
		System.out.println(getMax(array));
		


		
	}
}
