import java.util.Scanner;

public class Code05_06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a;

        System.out.print("숫자 입력 ===> : ");
        a = s.nextInt();

        if (a > 100) {
            if (a < 1000) {
                System.out.println("100보다 크고 1000보다 작군요.");
            } else if (a == 1000) {
                System.out.println("1000이네요!");
            } else if (a > 1000) {
                System.out.println("1000보다 크네요!");
            }
        }
    }
}
