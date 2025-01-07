class Casting
{
	public static void main(String args[])
	{

//This the example for type casting and conversion
		int a=25;
		byte b=(byte)a;

		byte c=25;
		double d=(double)c;

		float e=25.5f;
		int f=(int)e;

		int g=25;
		float h=(float)g;

//This the Type Promotion in java

		byte x=56;
		byte y=47;
		int result=x*y;

		System.out.print("\nByte= "+b);
		System.out.print("\nDouble= "+d);
		System.out.print("\nInt= "+f);
		System.out.print("\nFloat= "+h);
		System.out.print("\nResult= "+result);
	}
}
