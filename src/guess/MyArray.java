package guess;

public class MyArray {
    public static void main(String[] args) {
//        int [] myArray = {1,2,1,3,4};
//        int total = 0;
//
//        for(int i =0; i< myArray.length;i++){
//            total+=myArray[i];
//        }
//        System.out.print(total);
        final int ARRAY_LENGTH = 10;

        int [] numbers = new int[ARRAY_LENGTH];

        for (int x =0;x<numbers.length;x++){
            numbers[x] = (2 * x) + 2;
        }

        System.out.printf("%n%5s%n","index","Value");
        for (int x =0;x < numbers.length; x++){
            System.out.printf("%5d%8d%n",x,numbers[x]);
        }

    }



}
