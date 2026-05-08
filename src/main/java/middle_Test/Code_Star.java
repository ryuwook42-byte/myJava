package middle_Test;

import java.util.Scanner;

public class Code_Star {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("값을 입력 하세요 : ");
        int k = s.nextInt();

        for (int i = 0; i < k; i++) {
            String hap = " ";
            for (int j = 0; j < k - i; j++) hap += " ";
            for (int j = 0; j < i * 2 + 1; j++) hap += "*";
            System.out.println(hap);
        }
    }
}