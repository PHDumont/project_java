package introduction;

public class C4LoopStatements {
    public static void main(String[] args) {
        // while, do-while, for
        int counter =0;
//        while (counter < 10){
//            System.out.println(++counter);
//        }
        do{
            System.out.println("Inside " + ++counter);
        }while (counter < 10);

        // ;; invalid index
        for(int i=0;i<10;i++){
            System.out.println("For " + i);
        }
    }
}
