package introduction;

public class C4LoopStatements03 {
    public static void main(String[] args) {
        double carPrice = 20000;
        for (int mounthCount = (int) carPrice; mounthCount >= 1; mounthCount--) {
            double mounthlyPrice = carPrice / mounthCount;
            if(mounthlyPrice < 1000){
                continue;
            }
            System.out.println("Months "+ mounthCount + " Price: "+ mounthlyPrice);

        }
    }
}
