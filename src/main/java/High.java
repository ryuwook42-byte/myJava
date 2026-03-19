public class High {

    public static void main(String[] args) {

        System.out.println(aaa(1));
        System.out.println(aaa(2));
        System.out.println(aaa(3));
        System.out.println(bbb(3));
        System.out.println(bbb(1));
        System.out.println(bbb(2));
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

    public static String bbb(int x) {

        String y = "형님 하이요~";

        if (x == 1) {
            y = "뭐하고 계십니까";
        } else if (x == 2) {
            y = "안들려요?";
        }
        return y;
    }
}