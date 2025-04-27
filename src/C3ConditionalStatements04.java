public class C3ConditionalStatements04 {
    public static void main(String[] args) {
        byte day = 5;
        switch (day){
            case 1:
            case 7:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Week");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
