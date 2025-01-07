import java.util.Scanner;


class ScannerExample
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name = ");
		String name = sc.next();
		System.out.print("Enter Age = ");
		int age = sc.nextInt();
		System.out.print("Enter Salary = ");
		float salary = sc.nextFloat();
		

        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
        System.out.println("Salary = "+salary);
        
		sc.close();
	}
}
