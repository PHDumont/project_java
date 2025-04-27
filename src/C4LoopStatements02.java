public class C4LoopStatements02 {
    public static void main(String[] args) {
        double carPrice = 20000;
        for (int mounthCount = 1; mounthCount <= 20000; mounthCount++) {
            double mounthlyPrice = carPrice / mounthCount;

            if (mounthlyPrice < 1000) {
                break;
            }

            System.out.println("Months "+ mounthCount + " Price: "+ mounthlyPrice);

        }
    }
}
