package introduction;

public class C5Arrays {
    public static void main(String[] args) {
        //byte, short, double, float, long, int = 0
        // char '\u0000' ''
        // boolean false
        // String null
        String[] names = new String[3];
        names[0] = "Alberto";
        names[1] = "Bernard";
        names[2] = "Caio";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
