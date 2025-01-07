class DoWhile
{
	static public void main(String args[])
	{
		int i=1;
		do{
			System.out.println("Hello "+i);
			i++;
			{
				int j=1;
				do{
					System.out.println("Hi "+j);
					j++;
				}while(j<=2);
			}
		}while(i<=5);
	}
}