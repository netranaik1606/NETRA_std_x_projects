package java_package;
import java.util.Scanner;
public class StudentMarks {
	
	 String name;
	int rollno;
	double englishmarks;
	double hindimarks;
	double konkanimarks;
	double percentage;
	Scanner scn=new Scanner(System.in);
	
	public void accept() {
		System.out.println("enter ur Name");
		name=scn.next();
		System.out.println("enter ur rollno");
		rollno=scn.nextInt();
		System.out.println("enter ur englishmarks ");
		englishmarks=scn.nextDouble();
		System.out.println("enter ur hindimarks");
		hindimarks=scn.nextDouble();
		System.out.println("enter ur konkanimarks");
		konkanimarks=scn.nextDouble();
		
		
	}
	
	public void calculate() {
	
		
		double totalmarks=englishmarks + hindimarks + konkanimarks;
		percentage=(totalmarks/300)*100;
	
		
	}
	
	public void display() {
		
		System.out.println("name= "+ name);
		System.out.println("rollno= "+rollno);
		System.out.println("percentage= "+Math.round(percentage));
		
		
	}
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
        // StudentMarks scn=new StudentMarks();
       //  scn.accept();
       //  scn.calculate();
       //  scn.display();
		
		
	//}

}
