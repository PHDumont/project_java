package introduction;

public class C3ConditionalStatements {
    public static void main(String[] args) {
        int age = 20;
        boolean isAllowedToBuyAlcohol = age >= 18;
        if(isAllowedToBuyAlcohol){
            System.out.println("Authorized to buy alcohol");
        } else {
            System.out.println("Sorry, you are not allowed to buy alcohol");
        }

        // !
//        if (!isAllowedToBuyAlcohol){
//            System.out.println("Sorry, you are not allowed to buy alcohol");
//        }
        String category;

        if (age < 15){
            category = "Junior";
        } else if (age >= 15 && age < 18) {
            category =  "Senior";
        } else {
            category = "Master";
        }
        System.out.println(category);

        double salary = 2500D;
        String shouldBuyMessage = "buy PS5";
        String shouldNotBuyMessage = "don't buy PS5";
        // Ternary -> (condition) ? <true? : <false>
        String displayMessage = salary > 2000 ? shouldBuyMessage : shouldNotBuyMessage;

        System.out.println(displayMessage);

    }
}
