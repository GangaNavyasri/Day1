package assignment1;
import java.io.*;
public class RemoveDupChar {
	public static void main(String args[])throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any word: ");
		String  s=br.readLine();
		int l=s.length();
		char ch;
		String ans=" ";
		for(int i=0;i<1;i++)
		{
			ch=s.charAt(i);
			if(ch!=' ')
				ans=ans+ch;
			s=s.replace(ch,' ');
		}
		System.out.println("Word after removing duplicate characters: "+ans);
	}

}
