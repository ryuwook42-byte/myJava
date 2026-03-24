import java.util.Scanner;

public class Exam03 {

    public static void main(String[] args){
        Scanner b = new Scanner(System.in);

        String fri = "x값을 입력해 주세요. ===> ";
        String two = "y값을 입력해 주세요. ===> ";
        String three = "결과 값은 ";

        System.out.print(fri);
        int x = b.nextInt();

        System.out.print(two);
        int y = b.nextInt();
        System.out.print(three);

        double z = (double) x / y;
        System.out.printf("%d 나누기 %d은 %s 입니다.", x, y, z);

        b.close();
    }
}
