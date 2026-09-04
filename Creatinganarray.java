package java_package;
import java.util.Scanner;
public class Creatinganarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		//int x[]=new int[10];
		//for(int i=0; i<10; i++)
	//	{
	//		x[i]=scn.nextInt();
	//	}
		//for(int i=0; i<10; i++)
		//{
		//System.out.println(x[i]);
		//}
		
	char ch[]=new char[5];
	for(char i=0; i<5; i++)
{
	ch[i]=scn.next().charAt(0);
}
		for(char i=0; i<5; i++)
{
		System.out.println(ch[i]);
}
		
		
		
		
		
		
	}

}
