package pattern;

public class NumberPattern1 {
    public static void main(String[] args) {

        for (int row =1; row<= 5; row++){
            for (int space = 1;space <=(6 - row );space++){
                System.out.print(" ");
            }
            for (int number = 1;number <= (row * 2-1);number++){
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
