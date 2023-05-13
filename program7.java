package program7;

import java.util.Scanner;

public interface resume {
			void biodata();
}
public class Student implements resume{
	Scanner in=new Scanner(System.in);
	String name,dob,phone,address,results,descipline;
	public void biodata() {
		read();
		display();
	}
	public void read() {
		System.out.println("enter the student details such as name dob,phone,address, results,descipline");
		name=in.next();
		phone=in.next();
		address=in.next();
		results=in.next();
		descipline=in.next();
	}
	private void display() {
		System.out.println("NAME : "+name);
		System.out.println("DOB : "+dob);
		System.out.println("PHONE NUMBER : "+phone);
		System.out.println("ADDRESS : "+address);
		System.out.println("RESULTS : "+results);
		System.out.println("DESCIPLINE : "+descipline);
	}
}
public class teacher implements resume{
	Scanner in  = new Scanner(System.in);
	String name,dob,phno,address,qualification,experience,achievements;
	public void biodata(){
		display();
		read();
	}
	public void read() {
		System.out.println("enter the info of teacher such as name, dob, phone, number, address, qualification, experience, achievements");
		name=in.next();
		dob=in.next();
		phno=in.next();
		address=in.next();
		qualification=in.next();
		experience=in.next();
		achievements=in.next();
		}
	public void display() {
		System.out.println("NAME : "+name);
		System.out.println("DOB : "+dob);
		System.out.println("PHONE NUMBER : "+phno);
		System.out.println("ADDRESS : "+address);
		System.out.println("RESULTS : "+qualification);
		System.out.println("DESCIPLINE : "+experience);
		System.out.println("achievements : "+achievements);
	}
}
