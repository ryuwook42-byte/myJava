import java.util.Scanner;

public class Exam01_01 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열 a를 입력하세요. ");
        String a = sc.nextLine().toLowerCase().trim();

        System.out.println("문자열 b를 입력하세요. ");
        String b = sc.nextLine().toLowerCase().trim();


        System.out.println(a + b);

        sc.close();
    }
}
