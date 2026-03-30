import java.util.Scanner;

public class Code02_12_1 {

    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);

        int num1;
        double num2;

        System.out.print("값을 입력하세요 ==> : ");
        String str = string.nextLine();


        num1 = Integer.parseInt(str);
        System.out.println("문자열 ==> 정수 : " + num1);

        str = "3.14";
        num2 = Double.parseDouble(str);
        System.out.println("문자열 ==> 실수 : " + num2);
    }
}
