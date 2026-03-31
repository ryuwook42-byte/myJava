import java.util.Scanner;

public class Code05_03 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int a = 100;

        System.out.print("숫자 a와 비교할 수치를 입력해 주세요. : ");
        int b = s.nextInt();

        if(b > a) {
            System.out.println("a값 보다 큽니다. ");
        }else if(b < a){
            System.out.println("a값 보다 작습니다. ");
        }else
            System.out.println("a값과 동일합니다. ");
    }
}
