import java.util.Scanner;

public class Code03_10_01 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int a,b,c,d,e,f;
        String A = "A";
        String B = "B";
        String C = "C";
        String D = "D";
        String F = "F";

        System.out.println("A학점 커트라인을 입력하세요. : ");
        a = s.nextInt();

        System.out.println("B학점 커트라인을 입력하세요. : ");
        b = s.nextInt();

        System.out.println("C학점 커트라인을 입력하세요. : ");
        c = s.nextInt();

        System.out.println("D학점 커트라인을 입력하세요. : ");
        d = s.nextInt();

        System.out.println("F학점 커트라인을 입력하세요. : ");
        e = s.nextInt();

        System.out.println("학생의 이름을 입력하세요 : ");
        String x = s.nextLine();

        f = s.nextInt();
        System.out.printf("학생의 점수를 입력하세요 : %f\n ", f);

        if (( f <= 100) && ( f >= 90)) {
            System.out.printf("%s 학생의 학점등급은 A 등급입니다. \n", x);
        }


    }
}
