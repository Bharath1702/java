package student.details;

public class student {
	String name,usn,branch;
	long phno;
	public student(String name, String usn, String branch, long phno ) {
		this.branch=branch;
		this.name=name;
		this.usn=usn;
		this.phno=phno;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", usn=" + usn + ", branch=" + branch + ", phno=" + phno + "]";
	}
}

-------------------------------------------------------------------------------------------------------------------------------------------
package student.details;

import java.util.Scanner;

public class StudentDemo {
	public static void main(String [] args) {
		Scanner in=new Scanner(System.in);
		String name,usn,branch;
		long phno;
		student[] s=new student[10];
		System.out.println("enter the number of students");
		int n;
		n=in.nextInt();
		for(int i=0;i<n;++i) {
			System.out.println("enter the student details NAME,USN,BRANCH,PHNO");
			name=in.next();
			usn=in.next();
			branch=in.next();
			phno=in.nextLong();
			s[i]=new student(name,usn,branch,phno);
		}
		System.out.println("total number of students are : - "+n);
		for(int i=0;i<n;i++) {
			System.out.println("the data of"+i+"th element");
			System.out.println(s[i]);
		}
		
	}

}
