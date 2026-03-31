import java.util.Scanner;

public class Code05_08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int score;
        String b;

        System.out.print("점수를 입력해주세요. :");
        score = s.nextInt();

        if(score >= 90){
            b = "A학점 입니다.";
        }else if(score >= 80){
            b = "B학점 입니다.";
        }else if(score >= 70){
            b = "C학점 입니다.";
        }else if(score >= 60){
            b = "D학점 입니다.";
        }else {
            b = "F학점 입니다.";
        }
        System.out.println(b);
        s.close();
    }
}
