package assignment1;
import java.util.*;
public class EqualDistance {
	public static Scanner scan;
	public static void main(String args[]) {
		scan =new Scanner(System.in);
		 int i,size,temp=0;
		 System.out.println("Enter the aray size");
		 size=scan.nextInt();
		 System.out.println("Enter the integers of the array");
		 int integers[]=new int[size];
		 for(i=0;i<size;i++)
		 {
			 integers[1]=scan.nextInt();
		 }
		 System.out.println("Enter an integer 'k' specifying atmost difference");
		 int k=scan.nextInt();
		 for(i=0;i<size;i++)
		 {
			 temp=integers[i];
		 for(int j=i+1;j<size;j++)
		 {
			 if(integers[j]==temp)
			 {
				 if(Math.abs(j-1)<=k)
				 {
				System.out.println(integers[j]+"at" +(i+1+", "+j+1));
				 }
			 }
		 }
		 
		 }
	}

}
