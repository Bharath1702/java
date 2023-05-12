-----------------------------------------------------------------------------------------------------------------------------------
package program4;

import java.util.Scanner;

public class Staff {
	Scanner in=new Scanner(System.in);
	String name,staffid,phno,salary;
	public void read() {
	System.out.println("enter the name of the staff");
	name=in.next();
	System.out.println("enter the staffid of the staff");
	staffid=in.next();
	System.out.println("enter the phno of the staff");
	phno=in.next();
	System.out.println("enter the salary of the staff");
	salary=in.next();
	}
}
class teaching extends Staff{
	String domain,publications;
	public void read() {
		super.read();
		System.out.println("enter the domain of the staff");
		domain=in.next();
		System.out.println("enter the publication of the staff");
		publications=in.next();
		
	}
	public void display(){
		System.out.println("Name:"+name+ " \t staffid:"+staffid+" \t phone number:"+phno+"\t salary:"+salary+"\t domain:"+domain+"\t publications:"+publications);
	}
}
class technical extends Staff{
	String skills;
	public void read() {
		super.read();
		System.out.println("enter the skills of the staff");
		skills=in.next();
	}
	public void display(){
		System.out.println("Name:"+name+ " \t staffid:"+staffid+" \t phone number:"+phno+"\t salary:"+salary+"\t skills:"+skills);
	}
}
class contract extends Staff{
	String skills,cont;
	public void read() {
		super.read();
		System.out.println("enter the skills of the staff");
		skills=in.next();
		System.out.println("enter the contract period of the staff");
		cont=in.next();
	}
	public void display(){
		System.out.println("Name:"+name+ " \t staffid:"+staffid+" \t phone number:"+phno+"\t salary:"+salary+"\t skills:"+skills+"\t contract period:"+cont);
	}
}
---------------------------------------------------------------------------------------------------------------------------------------
package program4;

import java.util.Scanner;

public class StaffDemo {
	public static void main(String []args) {
		Scanner in=new Scanner(System.in);
		int m,n,o;
		teaching[] s;
		technical[] t;
		contract[] c;
		System.out.println("************ Read Teaching staff**************** /t enter the number of teaching staff");
		m=in.nextInt();
		for(int i=0;i<m;i++) {
			System.out.println("enter the teaching staff  " +i+ "  details");
			s=new teaching[m];
			s[i]=new teaching();
			s[i].read();
		}
		System.out.println("************ Read Technical staff**************** /t enter the number of teaching staff");
		n=in.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("enter the technical staff  " +i+ "  details");
			t=new technical[n];
			t[i]=new technical();
			t[i].read();
		}
		System.out.println("************ Read contract staff**************** /t enter the number of teaching staff");
		o=in.nextInt();
		for(int i=0;i<m;i++) {
			System.out.println("enter the contract staff  " +i+ "  details");
			c=new contract[o];
			c[i]=new contract();
			c[i].read();
		}
		System.out.println("************ Display Teaching staff**************** /t enter the number of teaching staff");
		for(int i=0;i<m;i++) {
			System.out.println("here is the teaching staff" +i+ "details");
			s=new teaching[m];
			s[i]=new teaching();
			s[i].display();
		}
		System.out.println("************ Display Technical staff**************** /t enter the number of teaching staff");
		n=in.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("here is the technical staff" +i+ "details");
			t=new technical[n];
			t[i]=new technical();
			t[i].display();
		}
		System.out.println("************ Display contract staff**************** /t enter the number of teaching staff");
		o=in.nextInt();
		for(int i=0;i<m;i++) {
			System.out.println("here is the contract staff" +i+ "details");
			c=new contract[o];
			c[i]=new contract();
			c[i].display();
		}
	}
}
