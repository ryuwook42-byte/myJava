package Practice;

import java.util.Scanner;

public class Practice00 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = 2;
        String var1 = "짝수";
        String var2 = "홀수";

        System.out.printf("입력한 값은 %d입니다.\n", a);

        if(a % b == 0) {
            System.out.println("2로 나누어지기 때문에 " + var1 + " 입니다.");
        }else {
            System.out.println("2로 나누어지지 않기 때문에 " + var2 + " 입니다.");
        }
        s.close();
    }
}
