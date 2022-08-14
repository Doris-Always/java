package pattern;

public class FirstPattern {
    public static void main(String[] args) {
//        for (int row = 1; row <= 5; row++) {
//            for (int space = 1; space <= (5 - row); space++) {
//                System.out.print(" ");
//            }
//            for (int star = 1; star <= (row * 2 - 1);star++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        int row = 1;
//        int star = 0;
//
//        while (row <= 5){
//
//            while (star <= row ){
//                System.out.print("*");
//
//                star++;
//            }
//
//            System.out.println();
//            row++;
        int row = 1, star = 0 ;
        while (row <= 5) {
            while (star <= row - 1) {
                System.out.print("* ");
                star++;
            }
            row++;
            star = 0;
            System.out.println();
        }
    }


}
