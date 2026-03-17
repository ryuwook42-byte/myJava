public class High {

    public static void main(String[] args) {

        System.out.println(aaa(1));
        System.out.println(aaa(2));
        System.out.print(aaa(4));
    }

    public static String aaa(int x) {
        String y = "영재 바보";
        if (x == 1) {
            y = "영재 할룽";
        } else if (x == 2) {
            y = "영재형 하이";
        }
        return y;
    }
}