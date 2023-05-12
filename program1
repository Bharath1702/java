package javaprograms.jit.cse;

import java.util.Scanner;

public class quadriatic_equation {
	public static void main(String[] args) {
		Double a,b,c,d;
		Double r1,r2;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the value for a,b and c ");
		a=in.nextDouble();
		b=in.nextDouble();
		c=in.nextDouble();
		d=(b*b)-4*a*c;
		if(a==0) {
			System.out.println("the roots are real and equal");
			r1=-b/(2*a);
			r2=r1;
			System.out.println("root 1 ="+r1+"root 2 ="+r2);
		}
		else if(a>0) {
			System.out.println("the roots are real and distinct");
			r1=(-b+Math.sqrt(d))/2*a;
			r2=(-b-Math.sqrt(d))/2*a;
			System.out.println("root 1 ="+r1+"root 2 ="+r2);
		}
		else {
			System.out.println("the roots are complex");
		}
	}

}
