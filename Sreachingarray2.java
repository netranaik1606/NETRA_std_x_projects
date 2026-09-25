package java_package;

public class Sreachingarray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x[]=new int[] {1,2,4,12,18};
       System.out.println(Searching (x,12));
	}
	
	public static int Searching(int x[],int search)
	{
		for(int i=0; i<x.length; i++)
		{
			if(x[i]==search)
			{
				return 1;
			}
		}return 0;
	}
} 
   