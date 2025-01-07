class Arithmetic2

{
	public static void main(String args[])
	{
		int x = 16;
		int y = 19;
		int result = x+y;
		System.out.println("Result of x + y = "+result);
		
		int result2 = x%y;
		System.out.println("Result of x % y = "+result2);

		int h = 40;
		h=h+5;
		System.out.println("Result of h = "+h);

		int a =50;
		++a;
		a++;
		System.out.println("Result of a = "+(a++));
		System.out.println("Result of a = "+a);


		
		int b=60;
		b--;
		System.out.println("Result of b = "+b);

		
		int c=60;
		System.out.println("Result of c = "+-(-c));


		int d = 80;
		int Result = d++;
		System.out.println("Result of Result = "+Result);          // fetch the value and then increment the value
		System.out.println("Result of d = "+d);    


		int e = 90;
		int Result2 = ++e;
		System.out.println("Result of Result2 = "+Result2);     //increment then fetch the value
		System.out.println("Result of e = "+e);    


		int f = 100;
		int Result3 = f--;
		System.out.println("Result of Result3 = "+Result3);
		System.out.println("Result of f = "+f);    


		int G = 110;
		int Result4 = --G;
		System.out.println("Result of Result4 = "+Result4);
		System.out.println("Result of G = "+G);    

		
	}
}