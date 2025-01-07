class Literals
{
    public static void main(String args[])
    {
        int num = 0b1010;

        System.out.printf("\n In Decimal = %d",num);
        System.out.printf("\n In Octal = %o",num);
        System.out.printf("\n In Hexadecimal = %x",num);
        System.out.printf("\n In Binary = %s",Integer.toBinaryString(num));

    }
}