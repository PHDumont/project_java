public class C2Operators {
    public static void main(String[] args) {
        // + - / *
        int number01 = 10;
        int number02 = 20;
        double result = number01 / (double) number02;
        System.out.println(result);

        // %
        int modulo = 21 % 7;
        System.out.println(modulo);

        // < > <= >= != ==
        boolean isTenLowerThanTwenty = 10 < 20;
        boolean isTenGreaterThanTwenty = 10 > 20;
        System.out.println("10<20 " + isTenLowerThanTwenty);
        System.out.println("10>20 " + isTenGreaterThanTwenty);

        // && (AND) || OR
        int age = 25;
        float salary = 3500F;
        boolean isLegalOlderThanThirty = age >= 30 && salary >= 4612;
        boolean isLegalYoungerThanThirty = age < 30 && salary >= 3381;
        System.out.println("isLegalOlderThanThirty " + isLegalOlderThanThirty);
        System.out.println("isLegalYoungerThanThirty " + isLegalYoungerThanThirty);

        double currentAccount = 299;
        double savingsAccount = 3000;
        float playstationFivePrice = 500;
        boolean canBeBought = currentAccount > playstationFivePrice || savingsAccount > playstationFivePrice;
        System.out.println("canBeBought " + canBeBought);

        // = == -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // Unary ++ --

        int count = 0;
        count++;  // add 1
        count--; // decrease 1
        System.out.println(count++); // After increment
        System.out.println(count);
        System.out.println(++count); // before increment





    }
}
