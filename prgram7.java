package java_package;
import java.util.Scanner;
public class prgram7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the String");
		String str=scn.next();
		String res="";
		
		int n=str.length();
		
		for(int i=0;i<n;i++)
		{
			char c=str.charAt(i);
		int code=(int)c;
				
		if(code>=65 && code<90) {
		code=code+32;
		char d=(char)code;
		res=res+d;
		}else {
		
			
			code=code-32;
			char d=(char)code;
			res=res+d;
		}
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
