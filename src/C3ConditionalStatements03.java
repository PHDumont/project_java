public class C3ConditionalStatements03 {
    public static void main(String[] args) {
        byte day = 8;
        // char, int, byte, short, enum, String
        switch (day){
            default:
                System.out.println("Invalid");
                break;
            case 1:
                System.out.println("Sun");
                break;
            case 2:
                System.out.println("Mon");
                break;
            case 3:
                System.out.println("Tue");
                break;
            case 4:
                System.out.println("Wed");
                break;
            case 5:
                System.out.println("Thu");
                break;
            case 6:
                System.out.println("Fri");
                break;
            case 7:
                System.out.println("Sat");
                break;
        }
        char gender = 'M';
        switch (gender){
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
                System.out.println("F");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
