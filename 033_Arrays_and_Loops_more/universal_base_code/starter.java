import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
		public static int minimum(int[] a){
			int c=0;
			int min=1000;

			while(c<a.length){
				if(a[c]<min){
					min=a[c];
				}
				c++;
			}
			return min;
		}
		
		public static int maximum(int[] a){
			int c=0;
			int max=-1;
			
			while(c<a.length){
				if(a[c]>max){
					max=a[c];
				}
				c++;
			}
			return max;
		}
		
		public static int average(int[] a){
			int c=0;
			int total=0;
			while (c<a.length){
				total=total+a[c];
				c++;
			}
			int av=total/c;
			return av;
		}

	public static void main(String args[]) {
		Random rand=new Random();
		int[] array=new int[100];
		int c=0;
		
		while(c<array.length){
			int r=rand.nextInt(100)+1;
			array[c]=r;
			c++;
		}
		
		
		
		System.out.println("The minimum is "+minimum(array));
		System.out.println("The maximum is "+maximum(array));
		System.out.println("The average is "+average(array));
			
		}

		
	}
