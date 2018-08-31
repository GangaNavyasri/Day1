package assignment1;

public class Search {
	public static void main(String args[]) {
		int i=0,n=15;
		int a[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int key=19;
		boolean found=false;
		for(i=0;i<n;i++)
		{
			if(a[i]==key)
			{
				found=true;
				break;
			}
		}
		if(found)
		{
		System.out.println("Found " +key+ " at index " +i+ "." );
		}
		else 
			System.out.println(key+ "not in array");
	}
		

}
