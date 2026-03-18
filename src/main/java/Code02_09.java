public class Code02_09 {

    public static void main(String[] args){
        int number1 = 10, number2 = 20;
        int resAdd;
        int resSub;
        int resMul;
        int resDiv;

        resAdd = number1 + number2;
        resSub = number1 - number2;
        resMul = number1 * number2;
        resDiv = number1 / number2;

        System.out.println(number1 + " + " + number2 + " = " + resAdd);
        System.out.println(number1 + " - " + number2 + " = " + resSub);
        System.out.println(number1 + " * " + number2 + " = " + resMul);
        System.out.println(number1 + " / " + number2 + " = " + resDiv);

        int resAdd1;
        int resSub1;
        int resMul1;
        double resDiv1;

        resAdd1 = number1 + number2;
        resSub1 = number1 - number2;
        resMul1 = number1 * number2;
        resDiv1 = (double) number1 / number2;

        System.out.println(number1 + " + " + number2 + " = " + resAdd1);
        System.out.println(number1 + " - " + number2 + " = " + resSub1);
        System.out.println(number1 + " * " + number2 + " = " + resMul1);
        System.out.println(number1 + " / " + number2 + " = " + resDiv1);
    }
}
