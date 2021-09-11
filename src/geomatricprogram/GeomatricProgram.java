package geomatricprogram;

import java.util.Scanner;

public class GeomatricProgram {
	double x1,x2,y1,y2;
	double a1,a2,b1,b2;
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		Scanner scan=new Scanner(System.in);
	      System.out.print("enter the values:");
	      double x1=scan.nextDouble();
	      double x2=scan.nextDouble();
	      double y1=scan.nextDouble();
	      double y2=scan.nextDouble();
	      System.out.print("enter the values:");
	      double a1=scan.nextDouble();
	      double a2=scan.nextDouble();
	      double b1=scan.nextDouble();
	      double b2=scan.nextDouble();
		double line1=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		double line2=Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1));
	    System.out.println("length is:"+line1);
	    System.out.println("length is:"+line2);
	    if (line1 == line2) {
			System.out.println("lines are equal");
		}
	    else if(line1>line2) {
	    	System.out.println("Line1 is greater");
	    }
	    else {
	    	
	    	System.out.println("Line2 is lesser than Line1");
	    }
		}
}

