public static void main(String[]args) {
		Scanner sc=new Scanner((Readable) System.out);
		int a,b;
		float result;
		System.out.println("enter the numerator");
		a=sc.nextInt();
		System.out.println("enter the denominator");
		b=sc.nextInt();
		try {
			result=a/b;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
