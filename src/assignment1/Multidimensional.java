package assignment1;
import java.util.*;
public class Multidimensional {
	public static void main(String args[]) {
		int [][]num= {{1,2,3,4}, {2,3,4,5},{4,5,6,7},{7,8,9,1}};
		int s2, flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element to be searched");
		s2=Integer.parseInt(sc.next());
		for(int i=0;i<num.length;i++)
		{
		 for(int j=0;j<num[i].length;j++)
		 {
				if(s2==num[i][j])
					flag=1;
		 }
		}
		
		if(flag==1)
			System.out.println("Element is found");
		else
			System.out.println("Element is not found");
	}
		
		}
