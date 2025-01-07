class logic2
{
	public static void main(String args[])
	{
		int x = 65;
		int y = 49;
		int a = 94; 
		int b = 38;
		boolean result = x > y  && a < b;	
		System.out.println("The result x > y  && y < x = "+result);

		int f = 87;
		int g = 98;
		int h = 39; 
		int i = 68;
		boolean result2 = f > g  || h < i;	
		System.out.println("The result f > g  || h < i = "+result2);

		int j = 95;
		int k = 49;
		int l = 84; 
		int m = 37;
		boolean result3 = j > k  & l > m;	
		System.out.println("The result k > l  & m < n = "+result3);

		int n = 65;
		int o = 63;
		boolean result4 = n > o; 	
		System.out.println("The result n = "+!result4);

	}
}