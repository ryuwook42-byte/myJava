import java.util.Scanner;

public class Exam01 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("a 값을 입력하세요 ==> ");
        int a = sc.nextInt();

        System.out.print("b 값을 입력하세요 ==> ");
        int b = sc.nextInt();
        double result = (double) a / b;

        System.out.println(a+"/"+b+"="+result);

        sc.close();
    }
}
