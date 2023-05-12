//Prime Numbers//
package program3;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String [] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter a number");
		int num;
		num=in.nextInt();
		int flag=0;
		for(int i=2;i<=num/2;++i) {
			if(num%i==0) {
				flag=1;
				break;
			}
		}
		if (flag==0) {
			System.out.println(num+"is a prime number");
		}
		else {
			System.out.println(num+"is not a prime number");
		}
			
	}

}

-----------------------------------------------------------------------------------------------------------------------------------------
  //Simple calculator
  package program3;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char oparator;
		float num1, num2,result;
		System.out.println("enter the value of 1st number");
		num1=in.nextFloat();
		System.out.println("enter the value of operator for arithematic operation such as + - * / %");
		oparator=in.next().charAt(0);
		System.out.println("enter the value of 2nd number");
		num2=in.nextFloat();
		switch(oparator) {
		case '+' :
			result=num1+num2;
			System.out.println("the sum of the input is");
			System.out.println(result);
			break;
		case '-' :
			result=num1-num2;
			System.out.println("the substraction of the input is");
			System.out.println(num1+"-"+num2+"="+result);
			break;
		case '*' :
			result=num1*num2;
			System.out.println("the multiplication of the input is");
			System.out.println(num1+"*"+num2+"="+result);
			break;
		case '/' :
			result=num1/num2;
			System.out.println("the devision of the input is");
			System.out.println(num1+"/"+num2+"="+result);
			break;
		case '%' :
			result=num1%num2;
			System.out.println("the percentage of the input is");
			System.out.println(num1+"%"+num2+"="+result);
			break;
		default :
			System.out.println("invalid operator");
		}
	}

}
