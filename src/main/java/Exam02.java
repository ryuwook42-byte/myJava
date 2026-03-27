import java.util.Scanner;

public class Exam02 {

    public static void main(String[] args){
        Scanner a = new Scanner(System.in);

        String fri = "x값을 입력해 주세요. ===> ";
        String two = "y값을 입력해 주세요. ===> ";
        String three = "결과 값은 ";

        System.out.print(fri);
        int x = a.nextInt();

        System.out.print(two);
        int y = a.nextInt();
        System.out.print(three);

        double z = (double) x / y;
        System.out.printf(x + " 나누기 " + y + "는 " + z + "입니다.");

        a.close();
    }
}
