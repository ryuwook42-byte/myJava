import java.util.Scanner;

public class Code06_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hap = 0;
        int num1, num2;

        while(true){
            System.out.print("숫자 ==> : ");
            num1 = s.nextInt();
            System.out.print("숫자 ==> : ");
            num2 = s.nextInt();

            hap = num1 + num2;
            System.out.println(num1 + "+" + num2 + "=" + hap);
            break;
        }
    }

    static class Rabbit {
        private String shape;
        private int xPos;
        private int yPos;

        Rabbit(){
            shape = "토끼";
        }

        Rabbit(String value){
            shape = value;
        }

        public void setPosition(int x, int y){
            this.xPos = x;
            this.yPos = y;
        }
        public void setShape(String shape){
            this.shape = shape;
        }
        public String getShape(){
            return this.shape;
        }
        public int getX() {
            return this.xPos;
        }
        public int getY(){
            return this.yPos;
        }

    }
}
