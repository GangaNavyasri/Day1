package assignment1;
import java.util.*;
public class Missing {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int total;
		System.out.println("Enter how many numbers to write");
int n= Integer.parseInt(sc.nextLine());
int array[]=new int[n];
for(int i=0;i<array.length;i++)
{
	array[i]=sc.nextInt();
}
int x=array.length;
total=((x+1)*(x+2))/2;
for(int i=0;i<x;i++) {
	total=array[i];
}
System.out.println("missing number is " +total);
	}

}
