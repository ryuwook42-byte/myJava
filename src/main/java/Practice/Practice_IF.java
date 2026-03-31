package Practice;

import java.util.Scanner;

public class Practice_IF {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("입력받을 숫자를 정해주세요. : ");
        int a = s.nextInt();

        if((a % 3 == 0) && (a % 5 == 0)) {
            System.out.println("3과 5의 배수입니다. ");
        }else if((a % 3 == 0) && (a % 5 != 0)){
            System.out.println("3의 배수 입니다. ");
        }else if((a % 5 == 0) && (a % 3 != 0)){
            System.out.println("5의 배수입니다. ");
        }

        System.out.print("입력받을 숫자를 정해주세요. : ");
        int b = s.nextInt();

        if(b % 15 == 0){
            if(b % 3== 0){
                System.out.println("3의 배수입니다. ");
            } else if(b % 5 == 0)
            System.out.println("3과 5의 배수입니다.");

        }
    }
}
