package nokia;


import java.util.Scanner;

public class NokiaMenu {

    public static void main(String[] args) {

        System.out.printf(" 1.Phone Book%n 2. Message%n 3. Chat%n 4. Call Register%n 5.Tones%n 6. Settings%n " +
                "7. Call Divert%n 8. Games%n 9.Calculator%n 10.Reminder%n 11.Clock%n 12.Profiles%n 13.Sim Services%n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Option: ");
        int menuOptions = input.nextInt();

        switch (menuOptions){
            case 1:
                phoneBook();
                break;
            case 2:
                messages();
                break;
            case 3:
                System.out.print("3.Chat");;
                break;
            case 4:
                callRegister();
                break;
//            case 5:
//                ringTones();
//                break;
//            case 6:
//               settings();
//                break;
//            case 7:
//                callDivert();
//                break;
//            case 8:
//               games();
//                break;
//            case 9:
//               phoneCalculator();
//                break;
//
//            case 10:
//                reminder();
//                break;
//            case 11:
//                clock();
//                break;
//            case 12:
//                myProfile();
//                break;
//
//            case 13:
//                simServices();
//                break;
//
            default:
                System.out.print("no such value in the menu");
                break;

        }

    }

    public static void phoneBook(){
        System.out.printf(" 1.Search%n 2.Service No%n  3.Add Name%n 4. Erase%n 5. Edit%n 6.Assign Tone%n 7.Send b'card%n " +
                " 8. Options%n 9.Speed dial%n 10.Voice tag%n");
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter your Option: ");

        int menuOptions = input2.nextInt();
        switch (menuOptions){
            case 1:
                System.out.print("1.Search");
                break;
            case 2:
                System.out.print("2.Services No");
                break;
            case 3:
                System.out.print("3.Add Name");
                break;
            case 4:
                System.out.print("4.Erase");
                break;
            case 5:
                System.out.print("5.Edit");
                break;
            case 6:
                System.out.print("6.Assign Tone");
                break;
            case 7:
                System.out.print("7.Send b'card");
                break;
            case 8:
                System.out.printf("8.Options%n");
                option();
                break;
            case 9:
                System.out.print("9.Speed Dial");
                break;
            case 10:
                System.out.print("10.Voice tag");
                break;
            default:
                phoneBook();
                break;
        }

    }
    public static void option(){
        System.out.printf("1.Type of view%n 2.Memory Status%n");
        Scanner optionInput = new Scanner(System.in);
        System.out.print("Enter 1 0r 2 for more options: ");
        int options = optionInput.nextInt();

        switch (options){
            case 1:
                System.out.print("1.Type of view");
                break;
            case 2:
                System.out.print("2.Memory Status");
                break;
            default:
                System.out.print("");
                break;
        }
    }

    public static void messages(){
        System.out.printf("1.Write messages%n 2.Inbox%n 3.Outbox%n 4.Picture messages%n 5.Templates%n 6.Smileys%n" +
                " 7.Message settings%n 8.Info services%n 9.Voice mail number%n 10.Services command editor%n");
        Scanner messageInput = new Scanner(System.in);
        System.out.print("Enter your Option: ");
        int message= messageInput.nextInt();

        switch (message){
            case 1:
                System.out.print("1.Write messages");
                break;
            case 2:
                System.out.print("2.Inbox");
                break;
            case 3:
                System.out.print("3.Outbox");
                break;
            case 4:
                System.out.print("4.Picture messages");
                break;
            case 5:
                System.out.print("5.Templates");
                break;
            case 6:
                System.out.print("6.Smiley");
                break;
            case 7:
                System.out.print("7.Message setting");
             case8:
                messageSetting();
                break;
            case 9:
                System.out.print("8.Info services");
                break;
            case 10:
                System.out.print("9.Voice mail number");
                break;
            case 11:
                System.out.print("10.Services command editor");
                break;
            default:
                System.out.print("no such entry"); ;
                break;

        }

    }
            public static void messageSetting(){
                System.out.printf("%n1.Set 1%n2.Common%n");
                Scanner messageSetInput = new Scanner(System.in);
                System.out.print("Enter your Option: ");
                int messageSub = messageSetInput.nextInt();

                    switch (messageSub){
                        case 1:
                            System.out.print("1.Set");
                                set();
                            break;
                        case 2:
                            System.out.print("2.Common");
                                common();
                            break;
                        default:
                            System.out.println("");
                            break;

                    }
            }

            private static void set() {
                System.out.printf("%n1.Message center number%n2.Message sent as%n3.Message validity%n");
                Scanner forSetInput = new Scanner(System.in);
                System.out.print("Enter your Option: ");
                int setMessage = forSetInput.nextInt();

                    switch (setMessage){
                        case 1:
                            System.out.print("1.Message center number");
                            break;
                        case 2:
                            System.out.print("2.Message sent");
                            break;
                        case 3:
                            System.out.print("3.Message validity");
                            break;
                        default:
                            messageSetting();
                            break;
                    }


            }

    public static void common() {
                System.out.printf("%n1.Delivery report%n2.Apply via same center%n3.Character support");
                Scanner commonInput = new Scanner(System.in);
                System.out.print("Enter 1 2 or 3 to choose: ");
                int forCommonInput = commonInput.nextInt();

                switch (forCommonInput){
                    case 1:
                        System.out.print("1.Delivery report");
                        break;
                    case 2:
                        System.out.print("2.Apply report");
                        break;
                    case 3:
                        System.out.print("3.Character support");
                        break;
                    default:
                        messageSetting();
                        break;

                }
            }

      public static void callRegister(){
          System.out.printf("%n1.Missed calls%n2.Received calls%n3.Dialled numbers%n4.Erase recent call list%n5.Show call duration%n" +
                  "6.Show call cost%n7.Call cost setting%n8.Prepaid credit");
          Scanner callInput = new Scanner(System.in);
          System.out.print("Enter any number to choose: ");
          int forCallInput = callInput.nextInt();
          switch (forCallInput){
              case 1:
                  System.out.print("1.Missed calls");
                  break;
              case 2:
                  System.out.print("2.Received calls");
                  break;
              case 3:
                  System.out.print("3.Dialled numbers");
                  break;
              case 4:
                  System.out.print("4.Erase recent calls");
                  break;
              case 5:
                  System.out.print("5.Show call duration");
                  callDuration();
                  break;
              case 6:
                  System.out.print("6.Show call cost");
                  callCost();
                  break;
              case 7:
                  System.out.print("Call cost setting");
                  costSetting();
                  break;
              case 8:
                  System.out.print("Prepaid credits");
                  break;
              default:
                  System.out.print("enter correct number");;
                  break;

          }
      }

        public static void callDuration() {
            System.out.printf("%n1.Last call cost%n2.All calls' duration%n3.Received calls's duration%n4.Dialled call duration%n5.Clear timers");
            Scanner durationInput = new Scanner(System.in);
            System.out.print("Enter 1 2 or 3 to choose: ");
            int forCallInput = durationInput.nextInt();

            switch (forCallInput){
                case 1:
                    System.out.print("1.Last call duration");
                    break;
                case 2:
                    System.out.print("2.All call's duration");
                    break;
                case 3:
                    System.out.print("3.Received call's duration");
                    break;
                case 4:
                    System.out.print("4.Dialled call duration");
                    break;
                case 5:
                    System.out.print("5.Clear timers");
                    break;
                default:
                    callRegister();
                    break;

            }
        }

        public static void callCost(){
            System.out.printf("%n1.Last call cost%n2.All call cost%n3.Clear countern");
            Scanner durationInput = new Scanner(System.in);
            System.out.print("Enter 1 2 or 3 to choose: ");
            int forCallInput = durationInput.nextInt();

            switch (forCallInput){
                case 1:
                    System.out.print("1.Last call cost");
                    break;
                case 2:
                    System.out.print("2.All call cost");
                    break;
                case 3:
                    System.out.print("3.Clear counter");
                    break;
                default:
                    callRegister();
                    break;
            }
        }

        public static void costSetting(){
            System.out.printf("%n1.Call cost limit%n2.Show cost in");
            Scanner durationInput = new Scanner(System.in);
            System.out.print("Enter 1 or 2  to choose: ");
            int forCallInput = durationInput.nextInt();

            switch (forCallInput){
                case 1:
                    System.out.print("1.Call cost limit");
                    break;
                case 2:
                    System.out.print("2.Show cost in");
                    break;
                default:
                    callRegister();
                    break;
            }
        }

}
