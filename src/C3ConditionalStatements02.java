public class C3ConditionalStatements02 {
    public static void main(String[] args) {
        double annualSalary = 70000;
        double firstTax = 9.7 / 100;
        double secondTax = 37.35 / 100;
        double thirdTax = 49.5 / 100;
        double amountToBePaid;

        if(annualSalary <= 34712){
            amountToBePaid = annualSalary * firstTax;
        } else if (annualSalary <= 68507) {
            amountToBePaid = annualSalary * secondTax;
        } else {
            amountToBePaid = annualSalary * thirdTax;
        }
        System.out.println(amountToBePaid);
    }
}
