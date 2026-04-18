package middle_Test;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int k = s.nextInt();

        for (int i = 0; i < k; i++) {
            String str = "";
            for (int j = 0; j < k - i - 1; j++) str += " ";
            for (int j = 0; j < 2 * i + 1; j++) str += "*";
            System.out.println(str);
        }
    }
}
