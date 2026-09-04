package java_package;
import java.util.Scanner;
public class prgram6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Radius");
		double radius=scn.nextDouble();
		System.out.println("Enter the Choice");
		System.out.println("1.circumference");
		System.out.println("2.diameter");
		System.out.println("3.area");
		int ch=scn.nextInt();
		
		switch(ch) {
		case 1:
			System.out.println("circumference of the circle"+2*3.14*radius);
		//	break;
		
		case 2:
			System.out.println("diameter of the circle"+2*radius);
			break;
			
		case 3:
			System.out.println("area of the circle"+2*radius*radius);
			break;
			
		default:
				System.out.println("Invalid choice");
		
		}
		
	}

}
