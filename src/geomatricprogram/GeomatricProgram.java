package geomatricprogram;

import java.util.Scanner;

public class GeomatricProgram {
	double x1,x2,y1,y2;
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		System.out.println("Welcome to Line Comparison Computation");
		Scanner scan=new Scanner(System.in);
	      System.out.println("enter the values:");
	      double x1=scan.nextDouble();
	      double x2=scan.nextDouble();
	      double y1=scan.nextDouble();
	      double y2=scan.nextDouble();
		double len=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	    System.out.println("length is:"+len);

}
}
