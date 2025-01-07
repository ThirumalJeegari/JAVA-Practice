import java.io.*;
class Easy {
    public static void main(String[] args)
    {
        // creating the instance of class BufferedReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
        String name;
        try {
            System.out.print("Enter your name = ");
            name = reader.readLine(); // taking string input
            System.out.println("You Entered Name=" + name);
        }
        catch (Exception e) {
        }
    }
}
