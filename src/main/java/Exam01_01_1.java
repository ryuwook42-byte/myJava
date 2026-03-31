import java.util.Scanner;

public class Exam01_01_1 {

    public static void main(String[] args) {
        Scanner c = new Scanner (System.in);

        System.out.print("문자열 a를 입력하세요.");
        String a = c.nextLine();

        System.out.print("문자열 b를 입력하세요.");
        String b = c.nextLine();

        System.out.println((a + b).toLowerCase().replaceAll(" ", ""));

        c.close();
    }
}
