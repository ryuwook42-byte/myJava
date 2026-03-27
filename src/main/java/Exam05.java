import java.util.Scanner;

public class Exam05 {

    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        int a;
        int b;

        a = x.nextInt();
        b = x.nextInt();

        System.out.printf("%d / %d = %.1f \n", a, b, (double) a / b);
        x.close();
    }

}
