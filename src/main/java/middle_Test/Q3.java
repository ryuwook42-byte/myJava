package middle_Test;

public class Q3 {
    public static void main(String[] args) {

        int hap = 0;
        for (int a = 100; a <= 300; a++)
            if (a % 5 == 0 && a % 7 == 0) hap += a;

        System.out.println(hap);
    }
}
