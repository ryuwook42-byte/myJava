import java.util.Scanner;

public class DiamondStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("다이아몬드의 크기(홀수)를 입력하세요: ");
        int n = sc.nextInt();
        int mid = n / 2; // 중앙 위치 계산

        // 1. 상단 삼각형 (중앙 포함)
        for (int i = 0; i <= mid; i++) {
            // 공백 출력
            for (int j = 0; j < mid - i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. 하단 삼각형 (역피라미드)
        for (int i = mid - 1; i >= 0; i--) {
            // 공백 출력
            for (int j = 0; j < mid - i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
