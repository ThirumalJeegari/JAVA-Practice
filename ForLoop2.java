public class ForLoop2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.print("i = " + i + ",  j =");
            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
                if (j < 5) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }
}
