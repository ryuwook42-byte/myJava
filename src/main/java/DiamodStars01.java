public class DiamodStars01 {
    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {

            int star = 4 - Math.abs(i - 4);

            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
