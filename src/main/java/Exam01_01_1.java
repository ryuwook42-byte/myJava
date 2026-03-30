import java.util.Scanner;

public class Exam01_01_1 {

    public static void main(String[] args) {
        Scanner c = new Scanner (System.in);

        System.out.println("문자열 a를 입력하세요.");
        String a = c.nextLine();

        System.out.println("문자열 b를 입력하세요.");
        String b = c.nextLine();

        // 1. 합치기 -> 2. 소문자 변환 -> 3. 모든 공백(" ")을 빈값("")으로 대체
        String result = (a + b).toLowerCase().replace(" ", "");

        System.out.println(result);

        c.close();
    }
}
