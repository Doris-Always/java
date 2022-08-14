package diary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Diary {
    private int count;

    private List<UserEntry> userEntries = new ArrayList<>();

    static Scanner takeUserInput = new Scanner(System.in);
    public static void main(String[] args) {
        User diary = new User();
//        userFirstDetails();

        
    }

//    public static void  userFirstDetails(){
//        System.out.printf("Add your user nane: ");
//        String name = takeUserInput.nextLine();
//
//        System.out.printf("Add your password: ");
//        String userPassword = takeUserInput.nextLine();
//        takeEntry();
//
//
//    }
//
//    public static void takeEntry(){
//        System.out.println("add new entry?\n Enter y/n");
//        String response = takeUserInput.nextLine();
//
//        if (response.toLowerCase().equals("y")){
//            System.out.println("Enter Description: ");
//            String desc = takeUserInput.nextLine();
//
//            System.out.println("create a story today:");
//            String story = takeUserInput.nextLine();
//        }else {
//            System.out.println("it");
//        }
//    }

    public boolean diaryEmpty(){
        return true;
    }
    public void addToEntry(){
        count++;
//        userEntries.setId(count);
//        userEntries.add(userEntry);

    }

    public int size(){
        return userEntries.size();
    }

    public  void deleteEntry(UserEntry userEntry){
        userEntries.remove(userEntry);
    }


}
