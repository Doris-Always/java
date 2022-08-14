package guess;

import java.util.Scanner;

public class Guess {

    public static void main(String[] args){

        Scanner takeInput = new Scanner(System.in);

        System.out.println("Guess your number between 1-100");

        int takeNumber = takeInput.nextInt();

        if (takeNumber < 20){
            System.out.print("Woo! you didnt guess right");

        }

        else if (takeNumber >= 21){
            System.out.print("Sorry dear,you are not yet there");
        }
        else if (takeNumber >= 100) {
            System.out.print("This number is much");
        }
        else if (takeNumber == 20) {
            System.out.print("yoo huu!! you made it");
        }


    }




}
