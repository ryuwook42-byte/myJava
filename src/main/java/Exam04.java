import java.util.Scanner;

public class Exam04 {

    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        System.out.print("a 값을 입력하세요 ==> ");
        int a = se.nextInt();

        System.out.print("b 값을 입력하세요 ==> ");
        int b = se.nextInt();
        double result = (double) a / b;

        System.out.println(a + "/" + b + "=" + result);

        se.close();
    }
}
