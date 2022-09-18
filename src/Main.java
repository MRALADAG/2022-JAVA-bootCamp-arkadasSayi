public class Main {
    public static void main(String[] args) {

        int number1 = 220;
        int number2 = 284;

        System.out.printf(findArkadasSayi(number1, number2) ? "\n%d ve %d sayıları arkadaş sayılardır.\n" : "\n%d ve %d sayıları arkadaş sayılar değillerdir.\n", number1, number2);
    }

    public static boolean findArkadasSayi(int number1, int number2) {
        boolean isArkadas = false;
        if (number1 > 1 && number2 > 1) {
            int total = 0;
            int total2 = 0;

            for (int i = 1; i < number1; i++) {
                if (number1 % i == 0) {
                    total += i;
                }
            }
            for (int i = 1; i < number2; i++) {
                if (number2 % i == 0) {
                    total2 += i;
                }
            }
            if (total == number2 && total2 == number1) {
                isArkadas = true;
            }
        }
        return isArkadas;
    }
}
