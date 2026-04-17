import java.util.Scanner;

public class Code06_12_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hap;
        int num1, num2;


        while(true) {

            System.out.print("숫자를 입력하세요 == > :");
            num1 = s.nextInt();

            System.out.print("숫자를 입력하세요 == > :");
            num2 = s.nextInt();

            hap = num1 + num2;
            System.out.println(num1 + "+" + num2 + "=" + hap);

            break;


        }
    }
}
