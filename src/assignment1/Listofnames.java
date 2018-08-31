package assignment1;
import java.io.*;
import java.util.Scanner;
public class Listofnames {
	private static Scanner ip;
	public static void main(String args[]) throws IOException{
		BufferedReader p= new BufferedReader(new InputStreamReader(System.in));
		ip =new Scanner(System.in);
		String name[]=new String[31],nam;
		System.out.println("Enter name");
		nam=ip.nextLine();
		System.out.println("Enter the size of an array");
		int size=ip.nextInt(),f1=0,i;
		System.out.println("Enter name array");
		for(i=0;i<=size;i++)
		{
			name[i]=p.readLine();
			System.out.println("name at" +i+" "+name[i]);
			if(name[i].equals(nam))
				f1++;
		}
		System.out.println("Frequency="+f1);
	}

}
