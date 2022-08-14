package pattern;

public class PyramidWithWhile {
    public static void main(String[] args) {
        int row = 1;
        int star =0;
        int space = 0;

        while (row <= 5){

            while (space <= row){
                System.out.print("");
                space++;

                while (star <=  row - 1){
                    System.out.print("* ");
                    star++;

                }

            }

            space = 0;
            star = 0;
            System.out.println();
            row++;
        }
    }
}
