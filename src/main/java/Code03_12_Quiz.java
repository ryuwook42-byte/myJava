import java.util.Scanner;

public class Code03_12_Quiz {

    public static void main(String[] argsS) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        System.out.println((a > 100) && (a < 200));
        System.out.println((a == 99) || (a == 100));
        System.out.println(!(a == 100));

        s.close();
    }
}
